package com.bcu.homeroom.service;
import java.sql.SQLException;
import java.util.List;
import com.bcu.homeroom.bean.City;
import com.bcu.homeroom.dao.CityDao;

public class CityService {
	private CityDao cityDao = new CityDao();	
	public List<City> getAllCity() throws SQLException{
		return cityDao.getAllCity() ;
	}
	public boolean insertCity(int cityid,String cityname)
	{
		return cityDao.insertCity(cityid, cityname);
	}
	public boolean deleteCity(int cityid)
	{
		return cityDao.deleteCity(cityid);
	}
}
