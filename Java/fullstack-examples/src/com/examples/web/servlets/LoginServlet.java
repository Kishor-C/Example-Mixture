package com.examples.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.web.exception.InvalidCredentialsException;
import com.examples.web.model.beans.Profile;
import com.examples.web.model.factory.ObjectFactory;
import com.examples.web.model.service.ProfileService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		Profile profile = null;
		try {
			ProfileService service = (ProfileService) ObjectFactory.getInstace("service");
			profile = service.login(userId, password);
		} catch(InvalidCredentialsException e) {
			request.setAttribute("message", e.getMessage());
		}
		if(profile != null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
			request.setAttribute("profile", profile);
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginError.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
