package com.rest.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rest.servlet.model.Automovel;
import com.rest.servlet.repository.Estoque;

@WebServlet("/automoveis/*")
public class AutomovelServlet extends HttpServlet{

	private static final long serialVersionUID = -638896147519496287L;

	private Estoque estoque = new Estoque();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		
		Collection<Automovel> automoveis = estoque.listarAutomoveis();
		
		for(Automovel auto : automoveis){
			out.print(auto);
		}
		
	}
	
	
}
