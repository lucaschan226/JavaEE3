package com.bcu.homeroom.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bcu.homeroom.bean.Hotel;
import com.bcu.homeroom.util.DBUtil;

public class HotelDao {
	private DBUtil util = new DBUtil();
	
	public List<Hotel> getAllHotel() throws SQLException{
		List<Hotel> hotels = new ArrayList<Hotel>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from hotel");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int hotelid = rs.getInt("hotelid");
				String hotelname = rs.getString("hotelname");
				String hotelcity = rs.getString("hotelcity");
				String hoteladdr=rs.getString("hoteladdr");
				String hoteldesc=rs.getString("hoteldesc");
				String hotelcontact=rs.getString("hotelcontact");
				String hotelband = rs.getString("hotelband");
				String hotelstar = rs.getString("hotelstar");
				String hotelstatus = rs.getString("hotelstatus");
				Date hotelordertime=rs.getTimestamp("hotelordertime");
				Date hotelconfirmtime = rs.getTimestamp("hotelconfirmtime");
				Hotel hotel = new Hotel(hotelid, hotelname, hotelcity,hoteladdr,hoteldesc,hotelcontact, hotelband,hotelstar, hotelstatus, hotelordertime, hotelconfirmtime);
				
				hotels.add(hotel);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return hotels;
	}	
	
	public List<Hotel> getConditionHotel(String hotelCity,String hotelName,int hotelId,String hotelStatus) throws SQLException{
		List<Hotel> hotels = new ArrayList<Hotel>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from hotel where hotelcity=? and hotelname=? and hotelid=? and hotelstatus=?");
		pstmt.setString(1, hotelCity);
		pstmt.setString(2, hotelName);
		pstmt.setInt(3, hotelId);
		pstmt.setString(4, hotelStatus);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int hotelid = rs.getInt("hotelid");
				String hotelname = rs.getString("hotelname");
				String hotelcity = rs.getString("hotelcity");
				String hoteladdr=rs.getString("hoteladdr");
				String hoteldesc=rs.getString("hoteldesc");
				String hotelcontact=rs.getString("hotelcontact");
				String hotelband = rs.getString("hotelband");
				String hotelstar = rs.getString("hotelstar");
				String hotelstatus = rs.getString("hotelstatus");
				Date hotelordertime=rs.getTimestamp("hotelordertime");
				Date hotelconfirmtime = rs.getTimestamp("hotelconfirmtime");
				Hotel hotel = new Hotel(hotelid, hotelname, hotelcity,hoteladdr,hoteldesc,hotelcontact, hotelband,hotelstar, hotelstatus, hotelordertime, hotelconfirmtime);
				
				hotels.add(hotel);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return hotels;
	}	
	
	
	public boolean insertHotel(int hotelid, String hotelname, String hotelcity, String hoteladdr,String hoteldesc,String hotelcontact,String hotelband, String hotelstar,  String hotelstatus, Date hotelordertime, Date hotelconfirmtime)
    {
        String sql="insert into hotel (hotelname, hotelcity, hoteladdr,hoteldesc,hotelcontact,hotelband,hotelstar, hotelstatus, hotelordertime, hotelconfirmtime) values (?,?,?,?,?,?,?,?,?,?)";
        Connection conn=util.getConnection();
        try {
            PreparedStatement pstmt=conn.prepareStatement(sql);     
            pstmt.setString(1,hotelname);
            pstmt.setString(2,hotelcity);
            pstmt.setString(3,hoteladdr);
            pstmt.setString(4,hoteldesc);
            pstmt.setString(5,hotelcontact);
            pstmt.setString(6,hotelband);
            pstmt.setString(7,hotelstar);
            pstmt.setString(8,hotelstatus);
            
            pstmt.setTimestamp(9, new Timestamp(hotelordertime.getTime()));  
            pstmt.setTimestamp(10,new Timestamp(hotelconfirmtime.getTime()));  
            
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
	public boolean editHotel(int hotelid, String hotelname, String hotelcity, String hoteladdr,String hoteldesc,String hotelcontact,String hotelband, String hotelstar,  String hotelstatus, Date hotelordertime, Date hotelconfirmtime)
	{
        String sql="update hotel set hotelname=?, hotelcity=?, hoteladdr=?,hoteldesc=?,hotelcontact=?,hotelband=?,hotelstar=?, hotelstatus=?, hotelordertime=?, hotelconfirmtime=? where hotelid=?";
        Connection conn=util.getConnection();
        try {
            PreparedStatement pstmt=conn.prepareStatement(sql);     
            pstmt.setString(1,hotelname);
            pstmt.setString(2,hotelcity);
            pstmt.setString(3,hoteladdr);
            pstmt.setString(4,hoteldesc);
            pstmt.setString(5,hotelcontact);
            pstmt.setString(6,hotelband);
            pstmt.setString(7,hotelstar);
            pstmt.setString(8,hotelstatus);
            
            pstmt.setTimestamp(9, new Timestamp(hotelordertime.getTime()));  
            pstmt.setTimestamp(10,new Timestamp(hotelconfirmtime.getTime()));  
            pstmt.setInt(11, hotelid);
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
	
	public boolean deleteHotel(int hotelid)
	 {
	        String sql="delete from hotel where hotelid=?";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setInt(1,hotelid);
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
	public List<Hotel> getOneHotel(int hid) throws SQLException{
		List<Hotel> hotels = new ArrayList<Hotel>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from hotel where hotelid="+hid);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int hotelid = rs.getInt("hotelid");
				String hotelname = rs.getString("hotelname");
				String hotelcity = rs.getString("hotelcity");
				String hoteladdr=rs.getString("hoteladdr");
				String hoteldesc=rs.getString("hoteldesc");
				String hotelcontact=rs.getString("hotelcontact");
				String hotelband = rs.getString("hotelband");
				String hotelstar = rs.getString("hotelstar");
				String hotelstatus = rs.getString("hotelstatus");
				Date hotelordertime=rs.getTimestamp("hotelordertime");
				Date hotelconfirmtime = rs.getTimestamp("hotelconfirmtime");
				Hotel hotel = new Hotel(hotelid, hotelname, hotelcity,hoteladdr,hoteldesc,hotelcontact, hotelband,hotelstar, hotelstatus, hotelordertime, hotelconfirmtime);
				hotels.add(hotel);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return hotels;
	}	
	
	public int getHotelId(String hotelname) throws SQLException{
		int hotelid = 0;
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from hotel where hotelname=?");
		pstmt.setString(1, hotelname);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
		    hotelid = rs.getInt("hotelid");
				
		}
		rs.close();
		pstmt.close();
		connection.close();
		return hotelid;
	}	
	 
}
