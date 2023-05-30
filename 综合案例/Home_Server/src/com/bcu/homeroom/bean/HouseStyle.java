package com.bcu.homeroom.bean;

public class HouseStyle {
	 private int housestyleid;
	 private String housestylename;
	 private int housestylecount;
	 private int housestylelocate;
     private float housestylespace;
     private String houseStyleType;  //后加
     private String housestyleaddbed;
     private String housestylewindow;
     private int houseStyleMaxPeople;//后加
     private int houseStyleInternet;//后加
     private int houseStyleSmoke;  //后加
     private String houseStyleKeyInfo;//后加
     private float housestyleprice;
	 public HouseStyle(int housestyleid,String housestylename,int housestylecount,int housestylelocate,float housestylespace,String houseStyleType,String housestyleaddbed,String housestylewindow,int houseStyleMaxPeople,int houseStyleInternet,int houseStyleSmoke,String houseStyleKeyInfo,float housestyleprice)
	 {
		 this.housestyleid=housestyleid;
		 this.housestylename=housestylename;
		 this.housestylecount=housestylecount;
		 this.housestylelocate=housestylelocate;
		 this.houseStyleType=houseStyleType;
	     this.housestylespace=housestylespace;
	     this.housestyleaddbed=housestyleaddbed;
	     this.housestylewindow=housestylewindow;
	     this.houseStyleMaxPeople=houseStyleMaxPeople;
	     this.houseStyleInternet=houseStyleInternet;
	     this.houseStyleSmoke=houseStyleSmoke;
	     this.houseStyleKeyInfo=houseStyleKeyInfo;
	     this.housestyleprice=housestyleprice;
	 }
	 public int getHousestyleid() {
		return housestyleid;
	}
	public void setHousestyleid(int housestyleid) {
		this.housestyleid = housestyleid;
	}
	public String getHousestylename() {
		return housestylename;
	}
	public void setHousestylename(String housestylename) {
		this.housestylename = housestylename;
	}
	public int getHousestylecount() {
		return housestylecount;
	}
	public void setHousestylecount(int housestylecount) {
		this.housestylecount = housestylecount;
	}
	public int getHousestylelocate() {
		return housestylelocate;
	}
	public void setHousestylelocate(int housestylelocate) {
		this.housestylelocate = housestylelocate;
	}
	public float getHousestylespace() {
		return housestylespace;
	}
	public void setHousestylespace(float housestylespace) {
		this.housestylespace = housestylespace;
	}
	public String getHousestyleaddbed() {
		return housestyleaddbed;
	}
	public void setHousestyleaddbed(String housestyleaddbed) {
		this.housestyleaddbed = housestyleaddbed;
	}
	public String getHousestylewindow() {
		return housestylewindow;
	}
	public void setHousestylewindow(String housestylewindow) {
		this.housestylewindow = housestylewindow;
	}
	public float getHousestyleprice() {
		return housestyleprice;
	}
	public void setHousestyleprice(float housestyleprice) {
		this.housestyleprice = housestyleprice;
	}
	 public String getHouseStyleType() {
			return houseStyleType;
		}
		public void setHouseStyleType(String houseStyleType) {
			this.houseStyleType = houseStyleType;
		}
		public int getHouseStyleMaxPeople() {
			return houseStyleMaxPeople;
		}
		public void setHouseStyleMaxPeople(int houseStyleMaxPeople) {
			this.houseStyleMaxPeople = houseStyleMaxPeople;
		}
		public int getHouseStyleInternet() {
			return houseStyleInternet;
		}
		public void setHouseStyleInternet(int houseStyleInternet) {
			this.houseStyleInternet = houseStyleInternet;
		}
		public int getHouseStyleSmoke() {
			return houseStyleSmoke;
		}
		public void setHouseStyleSmoke(int houseStyleSmoke) {
			this.houseStyleSmoke = houseStyleSmoke;
		}
		public String getHouseStyleKeyInfo() {
			return houseStyleKeyInfo;
		}
		public void setHouseStyleKeyInfo(String houseStyleKeyInfo) {
			this.houseStyleKeyInfo = houseStyleKeyInfo;
		}

}
