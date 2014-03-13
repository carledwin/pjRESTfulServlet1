package com.rest.servlet.http.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.rest.servlet.model.Automovel;

@XmlRootElement
public class Automoveis {

	private List<Automovel> automoviesXml = new ArrayList<Automovel>();
	
	@XmlElement(name="automovel")
	public List<Automovel> getAutomoviesXml(){
		return automoviesXml;
	}
	
	public void setAutomoviesXml(List<Automovel> automoviesXml){
		this.automoviesXml = automoviesXml;
	}
}
