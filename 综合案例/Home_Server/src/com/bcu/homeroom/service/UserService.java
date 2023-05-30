package com.bcu.homeroom.service;
import java.sql.SQLException;
import com.bcu.homeroom.bean.User;
import com.bcu.homeroom.dao.UserDao;

public class UserService {
	private UserDao userDao = new UserDao();
	public boolean judgeExist(User user) throws SQLException{
		return userDao.judgeExist(user);
	}
	public void insertUser(User user) throws SQLException{
		userDao.insertUser(user) ;
	}
	public boolean login(String username,String password) throws SQLException{
		return userDao.login(username,password);
	}
}
