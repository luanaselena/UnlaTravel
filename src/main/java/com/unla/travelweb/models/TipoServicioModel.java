package com.unla.travelweb.models;

import java.util.HashSet;
import java.util.Set;

import com.unla.travelweb.entities.Hotel;

public class TipoServicioModel {
	private long id;
	private double porcentajeAumento;
	private String tipo;
    private Set<Hotel> listaHoteles = new HashSet<Hotel>();

	
	public TipoServicioModel(long id, double porcentajeAumento, String tipo) {
		this.id = id;
		this.porcentajeAumento = porcentajeAumento;
		this.tipo = tipo;
	}
	
	
	public TipoServicioModel(double porcentajeAumento, String tipo) {
		this.porcentajeAumento = porcentajeAumento;
		this.tipo = tipo;
	}

	public TipoServicioModel() {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPorcentajeAumento() {
		return porcentajeAumento;
	}
	public void setPorcentajeAumento(double porcentajeAumento) {
		this.porcentajeAumento = porcentajeAumento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Set<Hotel> getListaHoteles() {
		return listaHoteles;
	}
	public void setListaHoteles(Set<Hotel> listaHoteles) {
		this.listaHoteles = listaHoteles;
	}
	
}
