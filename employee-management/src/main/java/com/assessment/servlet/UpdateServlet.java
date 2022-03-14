package com.assessment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.assessment.Emp;
import com.assessment.EmpDB;




@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String pid=request.getParameter("id");
		int id=Integer.parseInt(pid);
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		
		double salary=Integer.parseInt(request.getParameter("salary"));
		
		Emp emp=new Emp(id,name,city,salary);
		
		
		if (EmpDB.getDb().containsKey(emp.getEmpId())) {
			EmpDB.getDb().put(emp.getEmpId(), emp);
			out.println("Employee updated");
		} else {
			out.println("Employee not found");
		}
	}
	}


