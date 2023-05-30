package com.bcu.homeroom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcu.homeroom.bean.User;
import com.bcu.homeroom.service.UserService;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		userService = new UserService();
		try {
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				User user = new User();			
				user.setUsername(username);
				user.setPassword(password);			
				boolean result = userService.login(username,password);				
				if(result){				
					request.getSession().setAttribute("user", user);
					request.setAttribute("user", user);
					request.getSession().setAttribute("username",user.getUsername());
					request.setAttribute("username",user.getUsername());
					request.getRequestDispatcher("my.jsp").forward(request, response);			
				}
				if(!result){				
					request.setAttribute("message", "µÇÂ¼Ê§°Ü");				
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}			
			} catch (Exception e) {			
				e.printStackTrace();
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
