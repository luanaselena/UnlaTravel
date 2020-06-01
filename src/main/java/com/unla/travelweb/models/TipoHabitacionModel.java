package com.unla.travelweb.models;

public class TipoHabitacionModel {

	private long id;
	private double porcentajeAumento;
	private String tipo;
	
	public TipoHabitacionModel(long id, double porcentajeAumento, String tipo) {
		this.id = id;
		this.porcentajeAumento = porcentajeAumento;
		this.tipo = tipo;
	}
	
	
	public TipoHabitacionModel(double porcentajeAumento, String tipo) {
		this.porcentajeAumento = porcentajeAumento;
		this.tipo = tipo;
	}

	public TipoHabitacionModel() {}


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
