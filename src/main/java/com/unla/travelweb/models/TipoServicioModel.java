package com.unla.travelweb.models;

public class TipoServicioModel {
	private long id;
	private double porcentajeAumento;
	private String tipo;
	
	
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
}
