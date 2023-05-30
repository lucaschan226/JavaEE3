package com.bcu.homeroom.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcu.homeroom.bean.HouseStyle;
import com.bcu.homeroom.service.CityService;
import com.bcu.homeroom.service.HotelService;
import com.bcu.homeroom.service.HouseStyleService;
import com.bcu.homeroom.util.JsonDateValueProcessor;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

@WebServlet("/HouseStyleServlet")
public class HouseStyleServlet extends HttpServlet {		
	private HouseStyleService houseStyleService = new HouseStyleService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String cmd = request.getParameter("cmd");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=UTF8");

        PrintWriter out=response.getWriter();
		List<HouseStyle> houseStyles = new ArrayList<HouseStyle>();
		List<HouseStyle> housestyleone = new ArrayList<HouseStyle>();
		List<HouseStyle> housestyleC = new ArrayList<HouseStyle>();
		if("all".equals(cmd))
		{
			try {
				houseStyles=houseStyleService.getAllHouseStyle();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray NhouseStyles = JSONArray.fromObject(houseStyles, jsonConfig); 
			out.println(NhouseStyles);
		}
		if("findByCondition".equals(cmd))
		{
			String shotel=request.getParameter("s-hotel");
			HotelService hotelService=new HotelService();
			
			try {
				int hotelid=hotelService.getHotelId(shotel);
		    	housestyleC=houseStyleService.getCondHouseStyle(hotelid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray NhousestyleC = JSONArray.fromObject(housestyleC, jsonConfig); 
			out.println(NhousestyleC);
		}
		if("add".equals(cmd))
		{
	        String hotelname=new String(request.getParameter("hotelname").getBytes("iso8859_1"),"utf-8");
	        HotelService hotelService=new HotelService();       
			String housestylename=request.getParameter("houseStyleName");
			int housestylecount=Integer.parseInt(request.getParameter("houseStyleCount"));
			int housestylelocate=Integer.parseInt(request.getParameter("houseStyleLocate"));
			float housestylespace=Float.parseFloat(request.getParameter("houseStyleSpace"));
			String houseStyleType=request.getParameter("houseStyleType");
			String housestyleaddbed=request.getParameter("houseStyleAddBed");
			String housestylewindow=request.getParameter("houseStyleHasWindow");
			int houseStyleMaxPeople=Integer.parseInt(request.getParameter("houseStyleMaxPeople"));
			int houseStyleInternet=Integer.parseInt(request.getParameter("houseStyleInternet"));
			int houseStyleSmoke=Integer.parseInt(request.getParameter("houseStyleSmoke"));
			String houseStyleKeyInfo=request.getParameter("houseStyleKeyInfo");
			float housestyleprice=Float.parseFloat(request.getParameter("houseStylePrice"));
			boolean IsSave = false;
			try {
				IsSave = houseStyleService.insertHouseStyle(-1, housestylename, housestylecount, housestylelocate, housestylespace, houseStyleType, housestyleaddbed, housestylewindow, houseStyleMaxPeople, houseStyleInternet, houseStyleSmoke, houseStyleKeyInfo, housestyleprice, hotelService.getHotelId(hotelname));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println(IsSave);
		}
		if("del".equals(cmd))
		{
			String housestyleid=request.getParameter("housestyleid");
			boolean IsDel=houseStyleService.deleteHouseStyle(Integer.parseInt(housestyleid));
			out.println(IsDel);
		}
		if("find".equals(cmd))
		{
			String housestyleid=request.getParameter("housestyleid");
			try {
				housestyleone=houseStyleService.getOneHouseStyle(Integer.parseInt(housestyleid));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray NhouseStyleOne = JSONArray.fromObject(housestyleone, jsonConfig); 
			System.out.println(NhouseStyleOne);
			out.println(NhouseStyleOne);
		}
		if("edit".equals(cmd))
		{
			String hotelname=new String(request.getParameter("hotelname").getBytes("iso8859_1"),"utf-8");
	        HotelService hotelService=new HotelService();   
			int housestyleid=Integer.parseInt(request.getParameter("housestyleid"));
			String housestylename=request.getParameter("houseStyleName");
			int housestylecount=Integer.parseInt(request.getParameter("houseStyleCount"));
			int housestylelocate=Integer.parseInt(request.getParameter("houseStyleLocate"));
			float housestylespace=Float.parseFloat(request.getParameter("houseStyleSpace"));
			String houseStyleType=request.getParameter("houseStyleType");
			String housestyleaddbed=request.getParameter("houseStyleAddBed");
			String housestylewindow=request.getParameter("houseStyleHasWindow");
			int houseStyleMaxPeople=Integer.parseInt(request.getParameter("houseStyleMaxPeople"));
			int houseStyleInternet=Integer.parseInt(request.getParameter("houseStyleInternet"));
			int houseStyleSmoke=Integer.parseInt(request.getParameter("houseStyleSmoke"));
			String houseStyleKeyInfo=request.getParameter("houseStyleKeyInfo");
			float housestyleprice=Float.parseFloat(request.getParameter("houseStylePrice"));
			boolean IsEdit = false;
			try {
				IsEdit = houseStyleService.editHouseStyle(housestyleid, housestylename, housestylecount, housestylelocate, housestylespace, houseStyleType, housestyleaddbed, housestylewindow, houseStyleMaxPeople, houseStyleInternet, houseStyleSmoke, houseStyleKeyInfo, housestyleprice,hotelService.getHotelId(hotelname));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println(IsEdit);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}
