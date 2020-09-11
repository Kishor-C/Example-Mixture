package com.examples.web.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.web.exception.ProfileNotCreatedException;
import com.examples.web.model.beans.Profile;
import com.examples.web.model.factory.ObjectFactory;
import com.examples.web.model.service.ProfileService;


/**
 * Servlet implementation class FormHandlerServlet
 */
public class FormHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormHandlerServlet() {
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
		Profile profile = new Profile();
		profile.setName(request.getParameter("name"));
		profile.setPassword(request.getParameter("password"));
		profile.setDob(LocalDate.parse(request.getParameter("dob")));
		profile.setPhone(Long.parseLong(request.getParameter("phone")));
		int status = 0;
		try {
			ProfileService service = (ProfileService) ObjectFactory.getInstace("service");
			status = service.storeProfile(profile);
		} catch(ProfileNotCreatedException e) {
			request.setAttribute("message", e.getMessage());
		}
		if(status == 1) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("error.jsp");
			requestDispatcher.forward(request, response);
		}
		
	}

}
