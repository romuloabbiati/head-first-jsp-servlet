package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse 
		response) throws ServletException, IOException {
		
		String c = request.getParameter("colour");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
		request.setAttribute("styles", result);

		RequestDispatcher view = 
			request.getRequestDispatcher("result.jsp");

		view.forward(request, response);		
	}

}
