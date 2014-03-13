package com.rest.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.rest.servlet.http.xml.Automoveis;

import com.rest.servlet.repository.Estoque;

@WebServlet("/automoveisXml/*")
public class AutomovelServletXml extends HttpServlet{

	private static final long serialVersionUID = -638896147519496287L;

	private Estoque estoque = new Estoque();
	
	private static JAXBContext context;
	
	static{
		try {
	
			context = JAXBContext.newInstance(Automoveis.class);
			
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		try {
		
			Marshaller marshaller = context.createMarshaller();
			
			response.setContentType("application/xml;charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			
			Automoveis automoveis = new Automoveis();
			
			automoveis.setAutomoviesXml(new ArrayList<>(estoque.listarAutomoveis()));
			
			marshaller.marshal(automoveis, out);
			
		} catch (Exception e) {
			response.sendError(500, e.getMessage());
		}
	}
	
	
}
