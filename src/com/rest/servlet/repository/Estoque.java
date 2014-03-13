package com.rest.servlet.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.rest.servlet.model.Automovel;
import com.rest.servlet.model.Automovel.Categoria;
import com.rest.servlet.model.Automovel.Marca;

public class Estoque {
	
	private Collection<Automovel> automoveis = new ArrayList<>();
	
	public Collection<Automovel> getAutomoveis() {
		return automoveis;
	}



	public void setAutomoveis(Collection<Automovel> automoveis) {
		this.automoveis = automoveis;
	}



	public Estoque(){
		Automovel automovel01 = new Automovel("Ka", "Compacto e economico", Categoria.HATCH, Marca.FORD);
		Automovel automovel02 = new Automovel("Gol", "Compacto e economico", Categoria.HATCH, Marca.WOLKSWAGEM);
		Automovel automovel03 = new Automovel("EcoSport", "Espaçoso e aventureiro", Categoria.SUV, Marca.FORD);
		Automovel automovel04 = new Automovel("207", "Compacto e completo", Categoria.HATCH, Marca.PEUGEOT);
		Automovel automovel05 = new Automovel("HB20", "Confortável e potente", Categoria.HATCH, Marca.HYUNDAI);
		Automovel automovel06 = new Automovel("Civic", "Luxuoso por completo", Categoria.SEDAN, Marca.HONDA);
		
		automoveis.add(automovel01);
		automoveis.add(automovel02);
		automoveis.add(automovel03);
		automoveis.add(automovel04);
		automoveis.add(automovel05);
		automoveis.add(automovel06);
	}
	
	
	
	public Collection<Automovel> listarAutomoveis(){
		return new ArrayList<>(this.automoveis);
	}
	
	public void adicionarAutomovel(Automovel automovel){
		this.automoveis.add(automovel);
	}

}
