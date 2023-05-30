package com.bcu.homeroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bcu.homeroom.bean.City;
import com.bcu.homeroom.util.DBUtil;

public class CityDao {
	private DBUtil util = new DBUtil();
	public List<City> getAllCity() throws SQLException{
		List<City> citys = new ArrayList<City>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from city");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int cityid = rs.getInt("cityid");
				String cityname = rs.getString("cityname");
				City city = new City(cityid,cityname);
				citys.add(city);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return citys;
	}
	 public boolean insertCity(int cityid,String cityname)
	 {
	        String sql="insert into city (cityname) values (?)";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	           
	            pstmt.setString(1,cityname);
	            if (pstmt.executeUpdate()>0)
	            {
	                conn.close();
	                return true;
	            }
	            conn.close();
	        }catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	 }
	 public boolean deleteCity(int cityid)
	 {
	        String sql="delete from city where cityid=?";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setInt(1,cityid);
	            if (pstmt.executeUpdate()>0)
	            {
	                conn.close();
	                return true;
	            }
	        }catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	    } 
	 
}
