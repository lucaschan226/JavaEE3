package com.bcu.homeroom.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcu.homeroom.util.JsonDateValueProcessor;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import com.bcu.homeroom.bean.Order;
import com.bcu.homeroom.service.HotelService;
import com.bcu.homeroom.service.OrderService;
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
		
	private OrderService orderService = new OrderService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String cmd = request.getParameter("cmd");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=UTF8");

        PrintWriter out=response.getWriter();
		List<Order> orders = new ArrayList<Order>();
		List<Order> orderone = new ArrayList<Order>();
		if("all".equals(cmd))
		{
			try {
				orders=orderService.getAllOrder();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray Norders = JSONArray.fromObject(orders, jsonConfig); 
			out.println(Norders);
		}
		if("findByCondition".equals(cmd))
		{
			try {
			    int orderid=Integer.parseInt(request.getParameter("orderid"));
			    String hotelname=request.getParameter("hotelname");
			    String contactname=request.getParameter("contactname");
			    System.out.println(orderid);
			    System.out.println(hotelname);
			    System.out.println(contactname);
			    HotelService hotelService=new HotelService();
			    int hotelid=hotelService.getHotelId(hotelname);
				orders=orderService.getConditionOrder(orderid,hotelid,contactname);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray Norders = JSONArray.fromObject(orders, jsonConfig); 
			out.println(Norders);
		}
		
		
		
		if("del".equals(cmd))
		{
			String orderid=request.getParameter("orderid");
			boolean IsDel=orderService.deleteOrder(Integer.parseInt(orderid));
			out.println(IsDel);
		}
		if("find".equals(cmd))
		{
			String bandid=request.getParameter("orderid");
			try {
				orderone=orderService.getOneOrder(Integer.parseInt(bandid));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray Norderone = JSONArray.fromObject(orderone, jsonConfig); 
			System.out.println(Norderone);
			out.println(Norderone);
		}
		
		/*
	    id  订单id
	 订单号
	     入店时间
	      离店时间
	创建时间
	       酒店ID
	      售卖房型ID
	      入住人姓名
	     手机号
	  用户唯一标识
	      订单状态
	deposit 押金
	payable 应付金额
	payment 实付金额
	refund_reason 退款理由
	refuse_refund_reason 拒绝退款理由
	refund_deposit 退押金金额
	drefund_eposit_reason 扣押金理由
	refund_time申请退款时间
	 */
		if("edit".equals(cmd))
		{
			int orderid=Integer.parseInt(request.getParameter("orderid"));
			String order_number=request.getParameter("order_number");		
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
			Date start_time=null,end_time=null,create_time=null;
			try {
				start_time = simpleDateFormat.parse(request.getParameter("start_time"));
				end_time = simpleDateFormat.parse(request.getParameter("end_time"));
				create_time = simpleDateFormat.parse(request.getParameter("create_time"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			int hotel_id=Integer.parseInt(request.getParameter("hotel_id"));		
			int room_selling_id=Integer.parseInt(request.getParameter("room_selling_id"));	
			String name=request.getParameter("name");
			String telephone=request.getParameter("telephone");		
			System.out.println(telephone);
			String openid=request.getParameter("openid");
			String order_state=request.getParameter("order_state");
			float deposit=Float.parseFloat(request.getParameter("deposit"));
			float payable=Float.parseFloat(request.getParameter("payable"));
			float payment=Float.parseFloat(request.getParameter("payment"));
			String refund_reason=request.getParameter("refund_reason");
			String refuse_refund_reason=request.getParameter("refuse_refund_reason");
			float refund_deposit=Float.parseFloat(request.getParameter("refund_deposit"));
			String drefund_eposit_reason=request.getParameter("drefund_eposit_reason");
			Date refund_time=null;
			try {
				refund_time = simpleDateFormat.parse(request.getParameter("refund_time"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			boolean IsEdit=orderService.editOrder(orderid,order_number,start_time,end_time,create_time,hotel_id,room_selling_id,name,telephone,openid,order_state,deposit,payable,payment,refund_reason,refuse_refund_reason,refund_deposit,drefund_eposit_reason,refund_time);
			out.println(IsEdit);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}
