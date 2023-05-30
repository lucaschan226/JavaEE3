package com.bcu.homeroom.bean;
import java.util.Date;

public class Hotel {
	
	
	private int hotelid;
	private String hotelname;
	private String hotelcity;
	private String hoteladdr;
	private String hoteldesc;
	private String hotelcontact;
	private String hotelband;
	private String hotelstar;
	private String hotelstatus;
	private Date hotelordertime;
	private Date hotelconfirmtime;
	public Hotel(int hotelid, String hotelname, String hotelcity,String hoteladdr,String hoteldesc,String hotelcontact, String hotelband,String hotelstar, String hotelstatus, Date hotelordertime, Date hotelconfirmtime) {
		this.hotelid=hotelid;
		this.hotelname=hotelname;
		this.hotelcity=hotelcity;
		this.hoteladdr=hoteladdr;
		this.hoteldesc=hoteldesc;
		this.hotelcontact=hotelcontact;
		this.hotelband=hotelband;
		this.hotelstar=hotelstar;
		this.hotelstatus=hotelstatus;
		this.hotelordertime=hotelordertime;
		this.hotelconfirmtime=hotelconfirmtime;
	}
	public String getHoteladdr() {
		return hoteladdr;
	}
	public void setHoteladdr(String hoteladdr) {
		this.hoteladdr = hoteladdr;
	}
	public String getHoteldesc() {
		return hoteldesc;
	}
	public void setHoteldesc(String hoteldesc) {
		this.hoteldesc = hoteldesc;
	}
	public String getHotelcontact() {
		return hotelcontact;
	}
	public void setHotelcontact(String hotelcontact) {
		this.hotelcontact = hotelcontact;
	}
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHotelcity() {
		return hotelcity;
	}
	public void setHotelcity(String hotelcity) {
		this.hotelcity = hotelcity;
	}
	public String getHotelband() {
		return hotelband;
	}
	public void setHotelband(String hotelband) {
		this.hotelband = hotelband;
	}
	public String getHotelstar() {
		return hotelstar;
	}
	public void setHotelstar(String hotelstar) {
		this.hotelstar = hotelstar;
	}
	public String getHotelstatus() {
		return hotelstatus;
	}
	public void setHotelstatus(String hotelstatus) {
		this.hotelstatus = hotelstatus;
	}
	public Date getHotelordertime() {
		return hotelordertime;
	}
	public void setHotelordertime(Date hotelordertime) {
		this.hotelordertime = hotelordertime;
	}
	public Date getHotelconfirmtime() {
		return hotelconfirmtime;
	}
	public void setHotelconfirmtime(Date hotelconfirmtime) {
		this.hotelconfirmtime = hotelconfirmtime;
	}
}
