package com.ms.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CalculateServlet", urlPatterns = {"/CalculateServlet"}, initParams={
@WebInitParam(name="no1", value=""), 
@WebInitParam(name="no2", value=""),
@WebInitParam(name="opt", value=""),})
public class CalculateServlet extends HttpServlet {
	double res;

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		String n1 = request.getParameter("no1");
		String n2 = request.getParameter("no2");
		int opt = Integer.parseInt(request.getParameter("opt"));
		
		switch(opt) {
		case 1 : 
			res = new Calculater().doAdd(Integer.parseInt(n1), Integer.parseInt(n2));
			break;
		case 2 : 
			res = new Calculater().doSub(Integer.parseInt(n1), Integer.parseInt(n2));
			break;
		case 3 : 
			res = new Calculater().doMul(Integer.parseInt(n1), Integer.parseInt(n2));
			break;	
		case 4 : 
			res = new Calculater().doDiv(Integer.parseInt(n1), Integer.parseInt(n2));
			break;
		}
		out.println(res);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException 
	{
		doPost(request, response);
	}

}
