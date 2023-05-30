package com.bcu.homeroom.service;
import java.sql.SQLException;
import java.util.List;

import com.bcu.homeroom.bean.Band;
import com.bcu.homeroom.dao.BandDao;
public 
class BandService {
	private BandDao bandDao = new BandDao();	
	public List<Band> getAllBand() throws SQLException{
		return bandDao.getAllBand() ;
	}
	//getConditionBand();
	public List<Band> getConditionBand(int bandid,String bandname) throws SQLException{
		return bandDao.getConditionBand(bandid,bandname);
	}
	public List<Band> getOneBand(int bandid) throws SQLException{
		return bandDao.getOneBand(bandid) ;
	}
	public boolean insertBand(int bandid,String bandname,String bandicon,String banddetail,String bandremark)
	{
		return bandDao.insertBand(-1,bandname,bandicon,banddetail,bandremark);
	}
	public boolean deleteBand(int bandid)
	{
		return bandDao.deleteBand(bandid);
	}
	public boolean editBand(int bandid,String bandname,String bandicon,String banddetail,String bandremark)
	{
		return bandDao.editBand(bandid,bandname,bandicon,banddetail,bandremark);
	}
}
