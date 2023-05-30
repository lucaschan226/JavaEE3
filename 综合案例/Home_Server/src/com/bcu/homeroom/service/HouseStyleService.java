package com.bcu.homeroom.service;

import java.sql.SQLException;
import java.util.List;

import com.bcu.homeroom.bean.HouseStyle;
import com.bcu.homeroom.dao.HouseStyleDao;
public class HouseStyleService {
	private HouseStyleDao houseStyleDao = new HouseStyleDao();	
	public List<HouseStyle> getAllHouseStyle() throws SQLException{
		return houseStyleDao.getAllHouseStyle() ;
	}
	public List<HouseStyle> getOneHouseStyle(int housestyleid) throws SQLException{
		return houseStyleDao.getOneHouseStyle(housestyleid) ;
	}
	public List<HouseStyle> getCondHouseStyle(int hotelid) throws SQLException{
		return houseStyleDao.getCondHouseStyle(hotelid) ;
	}
	
	public boolean insertHouseStyle(int housestyleid,String housestylename,int housestylecount,int housestylelocate,float housestylespace,String houseStyleType,String housestyleaddbed,String housestylewindow,int houseStyleMaxPeople,int houseStyleInternet,int houseStyleSmoke,String houseStyleKeyInfo,float housestyleprice,int hotelid)
    {
		return houseStyleDao.inserthouseStyle(housestyleid,housestylename,housestylecount,housestylelocate,housestylespace,houseStyleType,housestyleaddbed,housestylewindow,houseStyleMaxPeople,houseStyleInternet,houseStyleSmoke,houseStyleKeyInfo,housestyleprice,hotelid);	    
	}
	public boolean deleteHouseStyle(int housestyleid)
	{
		return houseStyleDao.deleteHouseStyle(housestyleid);
	}
	public boolean editHouseStyle(int housestyleid,String housestylename,int housestylecount,int housestylelocate,float housestylespace,String houseStyleType,String housestyleaddbed,String housestylewindow,int houseStyleMaxPeople,int houseStyleInternet,int houseStyleSmoke,String houseStyleKeyInfo,float housestyleprice,int hotelid)
    {
		return houseStyleDao.edithouseStyle(housestyleid,housestylename,housestylecount,housestylelocate,housestylespace,houseStyleType,housestyleaddbed,housestylewindow,houseStyleMaxPeople,houseStyleInternet,houseStyleSmoke,houseStyleKeyInfo,housestyleprice,hotelid);	    
	}
}
