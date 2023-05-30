package com.bcu.homeroom.bean;
public class City {
	private int cityid;
    private String cityname;
    public City(int cityid,String cityname)
    {
         this.cityid=cityid;
         this.cityname=cityname;
    }
    public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
}
