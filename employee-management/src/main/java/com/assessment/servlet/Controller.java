package com.assessment.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String data=request.getParameter("data");
		switch (data) {
		case "create":
			RequestDispatcher rd= request.getRequestDispatcher("/create");
			rd.forward(request, response);
			break;
		case "find":
			RequestDispatcher rd1= request.getRequestDispatcher("/find");
			rd1.forward(request, response);
			break;
		case "update":
			RequestDispatcher rd2= request.getRequestDispatcher("/update");
			rd2.forward(request, response);
			break;
		case "delete":
			RequestDispatcher rd3= request.getRequestDispatcher("/delete");
			rd3.forward(request, response);
			break;
		case "list":
			RequestDispatcher rd4= request.getRequestDispatcher("/list");
			rd4.forward(request, response);
			break;
		
		default:
			response.sendError(404);
			break;
		}
	}

}
