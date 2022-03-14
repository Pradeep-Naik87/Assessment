package com.assessment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.EmpDB;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String pid=request.getParameter("id");
		int id=Integer.parseInt(pid);
		if (EmpDB.getDb().containsKey(id) ){
			EmpDB.getDb().remove(id);
			out.println("Removed Successfully");
		}
		else {
			out.println("No Such Employee found");
		}
	}

}
