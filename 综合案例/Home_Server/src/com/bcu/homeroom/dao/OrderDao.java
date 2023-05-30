package com.bcu.homeroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bcu.homeroom.bean.Order;
import com.bcu.homeroom.util.DBUtil;

public class OrderDao {
	private DBUtil util = new DBUtil();
	public List<Order> getAllOrder() throws SQLException{
		List<Order> orders = new ArrayList<Order>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from orders");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int orderid=rs.getInt("orderid");
				int hotelid=rs.getInt("hotelid");
				int housestyleid=rs.getInt("housestyleid");
				Date checkindate=rs.getTimestamp("checkindate");
				Date checkoutdate=rs.getTimestamp("checkoutdate");
				String contactusername=rs.getString("contactusername");
				String phone=rs.getString("phone");
				String status=rs.getString("status");	
				String order_number=rs.getString("order_number");
				Date create_time=rs.getTimestamp("create_time");
				String openid=rs.getString("openid");
				float deposit =rs.getFloat("deposit");
				float payable=rs.getFloat("payable");
				float payment=rs.getFloat("payment");
				String refund_reason=rs.getString("refund_reason");
				String refuse_refund_reason=rs.getString("refuse_refund_reason");
				float refund_deposit=rs.getFloat("refund_deposit");
				String drefund_eposit_reason=rs.getString("drefund_eposit_reason");
				Date refund_time=rs.getTimestamp("refund_time");
				
				Order order = new Order(orderid,hotelid,housestyleid,checkindate,checkoutdate,contactusername,phone,status,order_number,create_time,openid,deposit,payable,payment,refund_reason,refuse_refund_reason,refund_deposit,drefund_eposit_reason,refund_time);
			    orders.add(order);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return orders;
	}
	
	public List<Order> getConditionOrder(int orderId,int hotelId,String contactUsername) throws SQLException{
		List<Order> orders = new ArrayList<Order>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from orders where orderid=? and hotelid=? and contactusername=?");
		System.out.println("orderid:"+orderId);
		System.out.println("hotelId:"+hotelId);
		System.out.println("contactUsername:"+contactUsername);
		pstmt.setInt(1,orderId);
		pstmt.setInt(2,hotelId);
		pstmt.setString(3, contactUsername);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			System.out.println("you");
				int orderid=rs.getInt("orderid");
				int hotelid=rs.getInt("hotelid");
				int housestyleid=rs.getInt("housestyleid");
				Date checkindate=rs.getDate("checkindate");
				Date checkoutdate=rs.getDate("checkoutdate");
				String contactusername=rs.getString("contactusername");
				String phone=rs.getString("phone");
				String status=rs.getString("status");	
				String order_number=rs.getString("order_number");
				Date create_time=rs.getDate("create_time");
				String openid=rs.getString("openid");
				float deposit =rs.getFloat("deposit");
				float payable=rs.getFloat("payable");
				float payment=rs.getFloat("payment");
				String refund_reason=rs.getString("refund_reason");
				String refuse_refund_reason=rs.getString("refuse_refund_reason");
				float refund_deposit=rs.getFloat("refund_deposit");
				String drefund_eposit_reason=rs.getString("drefund_eposit_reason");
				Date refund_time=rs.getDate("refund_time");
				
				Order order = new Order(orderid,hotelid,housestyleid,checkindate,checkoutdate,contactusername,phone,status,order_number,create_time,openid,deposit,payable,payment,refund_reason,refuse_refund_reason,refund_deposit,drefund_eposit_reason,refund_time);
			    orders.add(order);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return orders;
	}
	
	public List<Order> getOneOrder(int oid) throws SQLException{
		List<Order> orders = new ArrayList<Order>();
		Connection connection = util.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from orders where orderid="+oid);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
				int orderid=rs.getInt("orderid");
				int hotelid=rs.getInt("hotelid");
				int housestyleid=rs.getInt("housestyleid");
				Date checkindate=rs.getDate("checkindate");
				Date checkoutdate=rs.getDate("checkoutdate");
				String contactusername=rs.getString("contactusername");
				String phone=rs.getString("phone");
				String status=rs.getString("status");	
				String order_number=rs.getString("order_number");
				Date create_time=rs.getDate("create_time");
				String openid=rs.getString("openid");
				float deposit =rs.getFloat("deposit");
				float payable=rs.getFloat("payable");
				float payment=rs.getFloat("payment");
				String refund_reason=rs.getString("refund_reason");
				String refuse_refund_reason=rs.getString("refuse_refund_reason");
				float refund_deposit=rs.getFloat("refund_deposit");
				String drefund_eposit_reason=rs.getString("drefund_eposit_reason");
				Date refund_time=rs.getDate("refund_time");
				
				Order order = new Order(orderid,hotelid,housestyleid,checkindate,checkoutdate,contactusername,phone,status,order_number,create_time,openid,deposit,payable,payment,refund_reason,refuse_refund_reason,refund_deposit,drefund_eposit_reason,refund_time);
			    orders.add(order);		
		}
		rs.close();
		pstmt.close();
		connection.close();
		return orders;
	}
	 public boolean deleteOrder(int orderid)
	 {
	        String sql="delete from orders where orderid=?";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setInt(1,orderid);
	            if (pstmt.executeUpdate()>0)
	            {
	                conn.close();
	                return true;
	            }
	        }catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	  } 
	 public boolean editOrder(int orderid,String order_number,Date start_time,Date end_time,Date create_time,int hotel_id,int room_selling_id,String name,String telephone,String openid,String order_state,float deposit,float payable,float payment,String refund_reason,String refuse_refund_reason,float refund_deposit,String drefund_eposit_reason,Date refund_time)
	 {
		 System.out.println("edit:"+telephone);
		 String sql="update orders set order_number=?,checkindate=?,checkoutdate=?,create_time=?,hotelid=?,housestyleid=?,contactusername=?,phone=?,openid=?,status=?,deposit=?,payable=?,payment=?,refund_reason=?,refuse_refund_reason=?,refund_deposit=?,drefund_eposit_reason=?,refund_time=? where orderid=?";
	        Connection conn=util.getConnection();
	        try {
	            PreparedStatement pstmt=conn.prepareStatement(sql);
	            pstmt.setString(1,order_number);
	            pstmt.setTimestamp(2, new Timestamp(start_time.getTime()));  
	            pstmt.setTimestamp(3, new Timestamp(end_time.getTime()));
	            pstmt.setTimestamp(4, new Timestamp(create_time.getTime()));
	            pstmt.setInt(5, hotel_id);
	            pstmt.setInt(6,room_selling_id);
	            pstmt.setString(7,name);
	            pstmt.setString(8,telephone);
	            pstmt.setString(9,openid);
	            pstmt.setString(10,order_state);
	            pstmt.setFloat(11, deposit);
	            pstmt.setFloat(12, payable);
	            pstmt.setFloat(13, payment);
	            pstmt.setString(14,refund_reason);
	            pstmt.setString(15,refuse_refund_reason);
	            pstmt.setFloat(16, refund_deposit);
	            pstmt.setString(17,refuse_refund_reason);
	            pstmt.setTimestamp(18, new Timestamp(start_time.getTime())); 
	            pstmt.setInt(19, orderid);
	            
	            if (pstmt.executeUpdate()>0)
	            {
	                conn.close();
	                return true;
	            }
	            conn.close();
	        }catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	 }
}
