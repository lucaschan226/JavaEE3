package com.bcu.homeroom.service;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import com.bcu.homeroom.bean.Order;
import com.bcu.homeroom.dao.OrderDao;

public class OrderService {
	private OrderDao orderDao = new OrderDao();	
	public List<Order> getAllOrder() throws SQLException{
		return orderDao.getAllOrder();
	}
	public List<Order> getConditionOrder(int orderid,int hotelid,String contactname) throws SQLException{
		return orderDao.getConditionOrder(orderid,hotelid,contactname);
	}
	public List<Order> getOneOrder(int orderid) throws SQLException{
		return orderDao.getOneOrder(orderid);
	}
	public boolean deleteOrder(int orderid)
	{
		return orderDao.deleteOrder(orderid);
	}
	public boolean editOrder(int orderid,String order_number,Date start_time,Date end_time,Date create_time,int hotel_id,int room_selling_id,String name,String telephone,String openid,String order_state,float deposit,float payable,float payment,String refund_reason,String refuse_refund_reason,float refund_deposit,String drefund_eposit_reason,Date refund_time)
	{
		return orderDao.editOrder(orderid,order_number,start_time,end_time,create_time,hotel_id,room_selling_id,name,telephone,openid,order_state,deposit,payable,payment,refund_reason,refuse_refund_reason,refund_deposit,drefund_eposit_reason,refund_time);
	}
	
}
