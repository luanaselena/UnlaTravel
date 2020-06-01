package com.unla.travelweb.models;

public class TipoRegimenModel {

	private long id;
	private double porcentajeAumento;
	private String tipo;
	
	public TipoRegimenModel(long id, double porcentajeAumento, String tipo) {
		this.id = id;
		this.porcentajeAumento = porcentajeAumento;
		this.tipo = tipo;
	}
	
	
	public TipoRegimenModel(double porcentajeAumento, String tipo) {
		this.porcentajeAumento = porcentajeAumento;
		this.tipo = tipo;
	}

	

	public TipoRegimenModel() {}


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
