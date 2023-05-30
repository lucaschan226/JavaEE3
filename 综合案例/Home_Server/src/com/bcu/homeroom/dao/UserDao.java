package com.bcu.homeroom.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bcu.homeroom.bean.User;
import com.bcu.homeroom.util.DBUtil;

public class UserDao {
	private DBUtil dbUtil = new DBUtil();
	public boolean judgeExist(User user) throws SQLException {
		boolean result = false;
		Connection connection = dbUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from user  where username=? and password=?");
		pstmt.setString(1,user.getUsername());
		pstmt.setString(2,user.getPassword());
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			result = true;
		}
		rs.close();
		pstmt.close();
		connection.close();
		return result;
	}
	public void insertUser(User user) throws SQLException{
		int result = 0;
		Connection connection = dbUtil.getConnection();
		PreparedStatement pStatement = connection.prepareStatement("insert into user values(NULL,?,?,?,?,?,?,?,?)");
		pStatement.setString(1,user.getUsername());
		pStatement.setString(2,user.getPassword());
		pStatement.setString(3,user.getName());
		pStatement.setString(4,user.getEmail());
		pStatement.setString(5,user.getPhone());
		pStatement.setString(6,user.getAddr());
		pStatement.setString(7,user.getBirthday());
		pStatement.setString(8,user.getGender());
		result = pStatement.executeUpdate();
		pStatement.close();
		connection.close();
		System.out.println(result);
	}
	public boolean login(String username,String password) throws SQLException{
		boolean result = false;
		Connection connection = dbUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select * from user  where username=? and password=?");
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			result = true;
		}
		rs.close();
		pstmt.close();
		connection.close();
		return result;
	}

}
