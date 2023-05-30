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

import com.bcu.homeroom.bean.Hotel;
import com.bcu.homeroom.bean.User;
import com.bcu.homeroom.service.HotelService;
import com.bcu.homeroom.util.JsonDateValueProcessor;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

@WebServlet("/HotelServlet")
public class HotelServlet extends HttpServlet {
		
	private HotelService hotelService = new HotelService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String cmd = request.getParameter("cmd");
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=UTF8");

        PrintWriter out=response.getWriter();
		List<Hotel> hotels = new ArrayList<Hotel>();
		List<Hotel> hotelone = new ArrayList<Hotel>();
		if("all".equals(cmd))
		{
			try {
				hotels=hotelService.getAllHotel();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray Nhotels = JSONArray.fromObject(hotels, jsonConfig); 
			System.out.println(Nhotels);
			request.setAttribute("hotels", hotels);
			out.println(Nhotels);
		}
		
		if("findByCondition".equals(cmd))
		{
			String hotelcity=request.getParameter("hotelcity");
			String hotelname=request.getParameter("hotelname");
			
			int hotelid=Integer.parseInt(request.getParameter("hotelid"));
			String hotelstatus=request.getParameter("status");
			System.out.println(hotelcity);
			System.out.println(hotelname);
			System.out.println(hotelid);
			System.out.println(hotelstatus);
			
			try {
				hotels=hotelService.getConditionHotel(hotelcity,hotelname,hotelid,hotelstatus);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray Nhotels = JSONArray.fromObject(hotels, jsonConfig); 
			System.out.println(Nhotels);
			out.println(Nhotels);
		}
		if("add".equals(cmd))
		{
			String hotelname=request.getParameter("hname");
			String hotelcity=request.getParameter("hcity");
			String hoteladdr=request.getParameter("haddr");		
			String hoteldesc=request.getParameter("hdesc");
			String hotelcontact=request.getParameter("hcontact");
			String hotelband=request.getParameter("hband");
			String hotelstar=request.getParameter("hstar");
			String hotelstatus=request.getParameter("hstatus");
			Date hotelordertime=null,hotelconfirmtime=null;
			String ordertime = request.getParameter("hordertime");
			String confirmtime = request.getParameter("hconfirmtime");
			
			SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date(System.currentTimeMillis());	
			
			ordertime=simpleDateFormat.format(date)+" "+ordertime+":00";
			confirmtime=simpleDateFormat.format(date)+" "+confirmtime+":00";
			
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		  
			try {
			     hotelordertime = simpleDateFormat.parse(ordertime);
			     hotelconfirmtime = simpleDateFormat.parse(confirmtime);
			     
			} catch (ParseException e) {
			             e.printStackTrace();
			}
			System.out.println(hotelordertime);
			boolean IsSave=hotelService.insertHotel(-1, hotelname, hotelcity, hoteladdr,hoteldesc,hotelcontact,hotelband, hotelstar, hotelstatus, hotelordertime, hotelconfirmtime);
			out.println(IsSave);
		}
		
		if("edit".equals(cmd))
        {
			
			//hotelid="+id+"&hname="+$("#hname").val()+"&hcity="+$("#hcity").val()+"&haddr="+$("#haddr").val()+"&hdesc="+$("#hdesc").val()+"&hcontact="+$("#hcontact").val()+"&hband="+$("#hband").val()+"&hstar="+$("#hstar").val()+"&hstatus="+$("#hstatus").val()+"&hordertime="+$("#hordertime").val()+"&hconfirmtime="+$("#hconfirmtime").val(),
		     
			int hotelid=Integer.parseInt(request.getParameter("hotelid"));
			String hotelname=request.getParameter("hname");
			String hotelcity=request.getParameter("hcity");
			String hoteladdr=request.getParameter("haddr");		
			String hoteldesc=request.getParameter("hdesc");
			String hotelcontact=request.getParameter("hcontact");
			String hotelband=request.getParameter("hband");
			String hotelstar=request.getParameter("hstar");
			String hotelstatus=request.getParameter("hstatus");
			Date hotelordertime=null,hotelconfirmtime=null;
			String ordertime = request.getParameter("hordertime");
			String confirmtime = request.getParameter("hconfirmtime");
			
			SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date(System.currentTimeMillis());	
			
			ordertime=simpleDateFormat.format(date)+" "+ordertime+":00";
			confirmtime=simpleDateFormat.format(date)+" "+confirmtime+":00";
			
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		  
			try {
			     hotelordertime = simpleDateFormat.parse(ordertime);
			     hotelconfirmtime = simpleDateFormat.parse(confirmtime);
			     
			} catch (ParseException e) {
			             e.printStackTrace();
			}
			System.out.println(hotelordertime);
			boolean IsEdit=hotelService.editHotel(hotelid, hotelname, hotelcity, hoteladdr,hoteldesc,hotelcontact,hotelband, hotelstar, hotelstatus, hotelordertime, hotelconfirmtime);
			out.println(IsEdit);
        }
		if("del".equals(cmd))
		{
			String hotelid=request.getParameter("hotelid");
			boolean IsDel=hotelService.deleteHotel(Integer.parseInt(hotelid));
			out.println(IsDel);
		}
		if("find".equals(cmd))
		{
			String hotelid=request.getParameter("hotelid");
			try {
				hotelone=hotelService.getOneHotel(Integer.parseInt(hotelid));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray NhotelOne = JSONArray.fromObject(hotelone, jsonConfig); 
			System.out.println(NhotelOne);
			out.println(NhotelOne);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}
