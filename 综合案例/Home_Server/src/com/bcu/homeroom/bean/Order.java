package com.bcu.homeroom.bean;

import java.util.Date;

public class Order {
	
	private int orderid;
	private int hotelid;
	private int housestyleid;
    private Date checkindate;
    private Date checkoutdate;
    private String contactusername;
	private String phone;
	private String status;
	private String order_number;
	private Date create_time;
	private String openid;
	private float deposit;
	private float payable;
	private float payment;
	private String refund_reason;
	private String refuse_refund_reason;
	private float refund_deposit;
	private String drefund_eposit_reason;
	private Date refund_time;
	
	public Order(int orderid,int hotelid,int housestyleid,Date checkindate,Date checkoutdate,String contactusername,String phone,String status,String order_number,Date create_time,String openid,float deposit,float payable,float payment,String refund_reason,String refuse_refund_reason,float refund_deposit,String drefund_eposit_reason,Date refund_time)
	{
		this.orderid=orderid;
		this.hotelid=hotelid;
		this.housestyleid=housestyleid;
	    this.checkindate=checkindate;
	    this.checkoutdate=checkoutdate;
	    this.contactusername=contactusername;
		this.phone=phone;
		this.status=status;
		
		this.order_number=order_number;
		this.create_time=create_time;
		this.openid=openid;
		this.deposit=deposit;
		this.payable=payable;
		this.payment=payment;
		this.refund_reason=refund_reason;
		this.refuse_refund_reason=refuse_refund_reason;
		this.refund_deposit=refund_deposit;
		this.drefund_eposit_reason=drefund_eposit_reason;
		this.refund_time=refund_time;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public int getHousestyleid() {
		return housestyleid;
	}
	public void setHousestyleid(int housestyleid) {
		this.housestyleid = housestyleid;
	}
	public Date getCheckindate() {
		return checkindate;
	}
	public void setCheckindate(Date checkindate) {
		this.checkindate = checkindate;
	}
	public Date getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
	public String getContactusername() {
		return contactusername;
	}
	public void setContactusername(String contactusername) {
		this.contactusername = contactusername;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public float getPayable() {
		return payable;
	}
	public void setPayable(float payable) {
		this.payable = payable;
	}
	public float getPayment() {
		return payment;
	}
	public void setPayment(float payment) {
		this.payment = payment;
	}
	public String getRefund_reason() {
		return refund_reason;
	}
	public void setRefund_reason(String refund_reason) {
		this.refund_reason = refund_reason;
	}
	public String getRefuse_refund_reason() {
		return refuse_refund_reason;
	}
	public void setRefuse_refund_reason(String refuse_refund_reason) {
		this.refuse_refund_reason = refuse_refund_reason;
	}
	public float getRefund_deposit() {
		return refund_deposit;
	}
	public void setRefund_deposit(float refund_deposit) {
		this.refund_deposit = refund_deposit;
	}
	public String getDrefund_eposit_reason() {
		return drefund_eposit_reason;
	}
	public void setDrefund_eposit_reason(String drefund_eposit_reason) {
		this.drefund_eposit_reason = drefund_eposit_reason;
	}
	public Date getRefund_time() {
		return refund_time;
	}
	public void setRefund_time(Date refund_time) {
		this.refund_time = refund_time;
	}
}
