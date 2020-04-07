package com.examples.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.model.beans.Users;
import com.examples.model.dao.UserDaoImpl;

/**
 * Servlet implementation class SearchUsers
 */
public class SearchUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDaoImpl impl = new UserDaoImpl();
		int ph = Integer.parseInt(request.getParameter("ph"));
		List<Users> allUsers = impl.findAllUsers(ph);
		request.setAttribute("k", allUsers);
		RequestDispatcher rd = request.getRequestDispatcher("displayUsers.jsp");
		rd.forward(request, response);
	}

}
