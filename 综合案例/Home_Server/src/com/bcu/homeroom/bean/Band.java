package com.bcu.homeroom.bean;

public class Band {
	private int bandid;
	private String bandname;
	private String bandicon;
	private String banddetail;
	private String bandremark;
	public Band(int bandid,String bandname,String bandicon,String banddetail,String bandremark)
	{
		this.bandid=bandid;
		this.bandname=bandname;
		this.bandicon=bandicon;
		this.banddetail=banddetail;
		this.bandremark=bandremark;		
	}
	public int getBandid() {
		return bandid;
	}
	public void setBandid(int bandid) {
		this.bandid = bandid;
	}
	public String getBandname() {
		return bandname;
	}
	public void setBandname(String bandname) {
		this.bandname = bandname;
	}
	public String getBandicon() {
		return bandicon;
	}
	public void setBandicon(String bandicon) {
		this.bandicon = bandicon;
	}
	public String getBanddetail() {
		return banddetail;
	}
	public void setBanddetail(String banddetail) {
		this.banddetail = banddetail;
	}
	public String getBandremark() {
		return bandremark;
	}
	public void setBandremark(String bandremark) {
		this.bandremark = bandremark;
	}

}
