package com.unla.travelweb.models;

public class TipoAlojamientoModel {

	private long id;
	private double porcentajeAumento;
	private String tipo;
	
	public TipoAlojamientoModel(long id, double porcentajeAumento, String tipo) {
		this.id = id;
		this.porcentajeAumento = porcentajeAumento;
		this.tipo = tipo;
	}
		
	public TipoAlojamientoModel(double porcentajeAumento, String tipo) {
		this.porcentajeAumento = porcentajeAumento;
		this.tipo = tipo;
	}

	public TipoAlojamientoModel() {}


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
