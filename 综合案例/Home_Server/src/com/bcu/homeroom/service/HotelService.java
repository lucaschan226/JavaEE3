package com.bcu.homeroom.service;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.bcu.homeroom.bean.Hotel;
import com.bcu.homeroom.dao.HotelDao;

public class HotelService {
	private HotelDao hotelDao = new HotelDao();	
	public List<Hotel> getAllHotel() throws SQLException{
		return hotelDao.getAllHotel() ;
	}
	public List<Hotel> getConditionHotel(String hotelCity,String hotelName,int hotelId,String hotelStatus) throws SQLException{
		return hotelDao.getConditionHotel(hotelCity,hotelName,hotelId,hotelStatus) ;
	}
	public List<Hotel> getOneHotel(int hotelid) throws SQLException{
		return hotelDao.getOneHotel(hotelid) ;
	}
	public boolean insertHotel(int hotelid, String hotelname, String hotelcity, String hoteladdr,String hoteldesc,String hotelcontact,String hotelband, String hotelstar,  String hotelstatus, Date hotelordertime, Date hotelconfirmtime)
	{
		return hotelDao.insertHotel(hotelid, hotelname, hotelcity,hoteladdr,hoteldesc,hotelcontact,hotelband, hotelstar, hotelstatus, hotelordertime, hotelconfirmtime);
	}
	public boolean deleteHotel(int hotelid)
	{
		return hotelDao.deleteHotel(hotelid);
	}
	public boolean editHotel(int hotelid, String hotelname, String hotelcity, String hoteladdr,String hoteldesc,String hotelcontact,String hotelband, String hotelstar,  String hotelstatus, Date hotelordertime, Date hotelconfirmtime)
	{
		return hotelDao.editHotel(hotelid, hotelname, hotelcity,hoteladdr,hoteldesc,hotelcontact,hotelband, hotelstar, hotelstatus, hotelordertime, hotelconfirmtime);
	}
	
	public int getHotelId(String hotelname) throws SQLException
	{
		return hotelDao.getHotelId(hotelname);
	}
	
}
