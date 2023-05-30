package com.bcu.homeroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bcu.homeroom.bean.Band;
import com.bcu.homeroom.util.DBUtil;

public class BandDao {
private DBUtil util = new DBUtil();
	
	public List<Band> getAllBand() throws SQLException{
		List<Band> bands = new ArrayList<Band>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from band");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int bandid = rs.getInt("bandid");
				String bandname = rs.getString("bandname");
				String bandicon = rs.getString("bandicon");
				String banddetail = rs.getString("banddetail");
				String bandremark = rs.getString("bandremark");
				Band hotel = new Band(bandid, bandname, bandicon, banddetail,bandremark);
				bands.add(hotel);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return bands;
	}
	public List<Band> getConditionBand(int bandId,String bandName) throws SQLException{
		List<Band> bands = new ArrayList<Band>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from band where bandid=? and bandName=?");
		pstmt.setInt(1, bandId);
		pstmt.setString(2, bandName);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int bandid = rs.getInt("bandid");
				String bandname = rs.getString("bandname");
				String bandicon = rs.getString("bandicon");
				String banddetail = rs.getString("banddetail");
				String bandremark = rs.getString("bandremark");
				Band hotel = new Band(bandid, bandname, bandicon, banddetail,bandremark);
				bands.add(hotel);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return bands;
	}
	
	
	public List<Band> getOneBand(int bid) throws SQLException{
		List<Band> bands = new ArrayList<Band>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from band where bandid="+bid);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int bandid = rs.getInt("bandid");
				String bandname = rs.getString("bandname");
				String bandicon = rs.getString("bandicon");
				String banddetail = rs.getString("banddetail");
				String bandremark = rs.getString("bandremark");
				Band hotel = new Band(bandid, bandname, bandicon, banddetail,bandremark);
				bands.add(hotel);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return bands;
	}
	 public boolean insertBand(int bandid,String bandname,String bandicon,String banddetail,String bandremark)
	    {
	        String sql="insert into band(bandname,bandicon,banddetail,bandremark) values (?,?,?,?)";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setString(1,bandname);
	            pstmt.setString(2,bandicon);
	            pstmt.setString(3,banddetail);
	            pstmt.setString(4,bandremark);
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
	 
	 public boolean editBand(int bandid,String bandname,String bandicon,String banddetail,String bandremark)
	    {
	        String sql="update band set bandname=?,bandicon=?,banddetail=?,bandremark=? where bandid=?";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setString(1,bandname);
	            pstmt.setString(2,bandicon);
	            pstmt.setString(3,banddetail);
	            pstmt.setString(4,bandremark);
	            pstmt.setInt(5,bandid);
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
	 public boolean deleteBand(int bandid)
	 {
	        String sql="delete from band where bandid=?";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setInt(1,bandid);
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
