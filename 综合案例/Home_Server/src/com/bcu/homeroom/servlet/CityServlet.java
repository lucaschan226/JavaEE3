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

import com.bcu.homeroom.bean.City;
import com.bcu.homeroom.service.CityService;
import com.bcu.homeroom.util.JsonDateValueProcessor;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
		
	private CityService cityService = new CityService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String cmd = request.getParameter("cmd");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=UTF-8");

        PrintWriter out=response.getWriter();
		List<City> citys = new ArrayList<City>();
		if("all".equals(cmd))
		{
			try {
				citys=cityService.getAllCity();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JsonConfig jsonConfig = new JsonConfig();   //JsonConfig是net.sf.json.JsonConfig中的这个，为固定写法  
			jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());    
			JSONArray Ncitys = JSONArray.fromObject(citys, jsonConfig); 
			out.println(Ncitys);
			System.out.println(Ncitys);
		}
		
		if("add".equals(cmd))
		{
			String cityname=request.getParameter("cname");
			boolean IsSave=cityService.insertCity(-1,cityname);
			out.println(IsSave);
		}
		if("del".equals(cmd))
		{
			String cityid=request.getParameter("cityid");
			boolean IsDel=cityService.deleteCity(Integer.parseInt(cityid));
			out.println(IsDel);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}
