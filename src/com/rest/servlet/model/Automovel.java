package com.rest.servlet.model;

public class Automovel {
	private String nome_auto;
	private String descricao_auto;
	private Categoria categoria_auto;
	private Marca marca_auto;
	
	public enum Categoria{
		ENTRADA, HATCH, SEDAN, SW,MONOCAB, GRANDCAB, SPORTS, PICKUP, FURGAO, SUV
	}

	public enum Marca{
		FORD,WOLKSWAGEM, FIAT, TOYOTA, SUZUKI, SUBARU, SMART, RENAULT, VOLVO, PORSCHE, PEUGEOT, NISSAN, MISUBISHI, MERCEDES, KIA, HONDA, HYUNDAI, CHEVROLET, BMW 
	}
	
	public Automovel(){}
	
	public Automovel(String nome_auto, String descricao_auto, Categoria categoria_auto, Marca marca_auto){
		this.nome_auto = nome_auto;
		this.descricao_auto = descricao_auto;
		this.categoria_auto = categoria_auto;
		this.marca_auto = marca_auto;
	}
	
	public String toString(){
		return this.nome_auto + " - " + this.marca_auto;
	}
	
}
