package com.bcu.homeroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bcu.homeroom.util.DBUtil;
import com.bcu.homeroom.bean.HouseStyle;
public class HouseStyleDao {
	private DBUtil util = new DBUtil();
	public List<HouseStyle> getAllHouseStyle() throws SQLException{
		List<HouseStyle> housestyles = new ArrayList<HouseStyle>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from housestyle");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			    int housestyleid = rs.getInt("housestyleid");
				String housestylename=rs.getString("housestylename");
				int housestylecount=rs.getInt("housestylecount");
				int housestylelocate=rs.getInt("housestylelocate");
				float housestylespace=rs.getFloat("housestylespace");
				String houseStyleType=rs.getString("houseStyleType");
				String housestyleaddbed=rs.getString("housestyleaddbed");
				String housestylewindow=rs.getString("housestylewindow");
				int houseStyleMaxPeople=rs.getInt("houseStyleMaxPeople");
				int houseStyleInternet=rs.getInt("houseStyleInternet");
				int houseStyleSmoke=rs.getInt("houseStyleInternet");
				String houseStyleKeyInfo=rs.getString("houseStyleKeyInfo");
				float housestyleprice=rs.getFloat("housestyleprice");
				HouseStyle housestyle = new HouseStyle(housestyleid,housestylename,housestylecount,housestylelocate,housestylespace,houseStyleType,housestyleaddbed,housestylewindow,houseStyleMaxPeople,houseStyleInternet,houseStyleSmoke,houseStyleKeyInfo,housestyleprice);
				housestyles.add(housestyle);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return housestyles;
	}
	
	
	
	public List<HouseStyle> getCondHouseStyle(int hid) throws SQLException{
		List<HouseStyle> housestyles = new ArrayList<HouseStyle>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from housestyle where hotelid="+hid);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			    int housestyleid = rs.getInt("housestyleid");
				String housestylename=rs.getString("housestylename");
				int housestylecount=rs.getInt("housestylecount");
				int housestylelocate=rs.getInt("housestylelocate");
				float housestylespace=rs.getFloat("housestylespace");
				String houseStyleType=rs.getString("houseStyleType");
				String housestyleaddbed=rs.getString("housestyleaddbed");
				String housestylewindow=rs.getString("housestylewindow");
				int houseStyleMaxPeople=rs.getInt("houseStyleMaxPeople");
				int houseStyleInternet=rs.getInt("houseStyleInternet");
				int houseStyleSmoke=rs.getInt("houseStyleInternet");
				String houseStyleKeyInfo=rs.getString("houseStyleKeyInfo");
				float housestyleprice=rs.getFloat("housestyleprice");
				HouseStyle housestyle = new HouseStyle(housestyleid,housestylename,housestylecount,housestylelocate,housestylespace,houseStyleType,housestyleaddbed,housestylewindow,houseStyleMaxPeople,houseStyleInternet,houseStyleSmoke,houseStyleKeyInfo,housestyleprice);
				housestyles.add(housestyle);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return housestyles;
	}
		
	public List<HouseStyle> getOneHouseStyle(int hsid) throws SQLException{
		List<HouseStyle> housestyles = new ArrayList<HouseStyle>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from housestyle where housestyleid="+hsid);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			    int housestyleid = rs.getInt("housestyleid");
				String housestylename=rs.getString("housestylename");
				int housestylecount=rs.getInt("housestylecount");
				int housestylelocate=rs.getInt("housestylelocate");
				float housestylespace=rs.getFloat("housestylespace");
				String houseStyleType=rs.getString("houseStyleType");
				String housestyleaddbed=rs.getString("housestyleaddbed");
				String housestylewindow=rs.getString("housestylewindow");
				int houseStyleMaxPeople=rs.getInt("houseStyleMaxPeople");
				int houseStyleInternet=rs.getInt("houseStyleInternet");
				int houseStyleSmoke=rs.getInt("houseStyleInternet");
				String houseStyleKeyInfo=rs.getString("houseStyleKeyInfo");
				float housestyleprice=rs.getFloat("housestyleprice");
				HouseStyle housestyle = new HouseStyle(housestyleid,housestylename,housestylecount,housestylelocate,housestylespace,houseStyleType,housestyleaddbed,housestylewindow,houseStyleMaxPeople,houseStyleInternet,houseStyleSmoke,houseStyleKeyInfo,housestyleprice);
				housestyles.add(housestyle);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return housestyles;
	}
		
	public boolean edithouseStyle(int housestyleid, String housestylename, int housestylecount, int housestylelocate,float housestylespace, String houseStyleType, String housestyleaddbed, String housestylewindow,int houseStyleMaxPeople, int houseStyleInternet, int houseStyleSmoke, String houseStyleKeyInfo,float housestyleprice,int hotelid) 
	{
	        String sql="update housestyle set housestylename=?,housestylecount=?,housestylelocate=?,housestylespace=?,houseStyleType=?,housestyleaddbed=?,housestylewindow=?,houseStyleMaxPeople=?,houseStyleInternet=?,houseStyleSmoke=?,houseStyleKeyInfo=?,housestyleprice=?,hotelid=? where housestyleid=?";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setString(1,housestylename);
	            pstmt.setInt(2, housestylecount);
	            pstmt.setInt(3, housestylelocate);
				pstmt.setFloat(4, housestylespace);
				pstmt.setString(5, houseStyleType);				
				pstmt.setString(6, housestyleaddbed);
				pstmt.setString(7, housestylewindow);			
				pstmt.setInt(8, houseStyleMaxPeople);
				pstmt.setInt(9, houseStyleInternet);
				pstmt.setInt(10, houseStyleInternet);	
				pstmt.setString(11, houseStyleKeyInfo);
				pstmt.setFloat(12, housestyleprice);
				pstmt.setInt(13, hotelid);
				pstmt.setInt(14, housestyleid);
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
	 public boolean deleteHouseStyle(int housestyleid)
	 {
	        String sql="delete from housestyle where housestyleid=?";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setInt(1,housestyleid);
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
		
	 public boolean inserthouseStyle(int housestyleid, String housestylename, int housestylecount, int housestylelocate,float housestylespace, String houseStyleType, String housestyleaddbed, String housestylewindow,int houseStyleMaxPeople, int houseStyleInternet, int houseStyleSmoke, String houseStyleKeyInfo,float housestyleprice,int hotelid) 
		{
		        String sql="insert into housestyle (housestylename,housestylecount,housestylelocate,housestylespace,houseStyleType,housestyleaddbed,housestylewindow,houseStyleMaxPeople,houseStyleInternet,houseStyleSmoke,houseStyleKeyInfo,housestyleprice,hotelid) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		        Connection conn=util.getConnection();
		        try {
		            PreparedStatement pstmt=conn.prepareStatement(sql);
		            pstmt.setString(1,housestylename);
		            pstmt.setInt(2, housestylecount);
		            pstmt.setInt(3, housestylelocate);
					pstmt.setFloat(4, housestylespace);
					pstmt.setString(5, houseStyleType);				
					pstmt.setString(6, housestyleaddbed);
					pstmt.setString(7, housestylewindow);			
					pstmt.setInt(8, houseStyleMaxPeople);
					pstmt.setInt(9, houseStyleInternet);
					pstmt.setInt(10, houseStyleInternet);	
					pstmt.setString(11, houseStyleKeyInfo);
					pstmt.setFloat(12, housestyleprice);
					pstmt.setInt(13, hotelid);
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
}
