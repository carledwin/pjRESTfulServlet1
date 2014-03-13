package com.rest.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class Servlet3Test extends HttpServlet {

	
	//Servlet URL mapping - http://localhost:8080/pjRESTfulServlet/Welcome
	
	private static final long serialVersionUID = -3414147158060291906L;

	public Servlet3Test(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		//Browser Output
		printWriter.println("<p>Teste realizado com sucesso, resultado obtido a partir do metodo <b>doGet...</b></p>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException{
		
	}
	
}
