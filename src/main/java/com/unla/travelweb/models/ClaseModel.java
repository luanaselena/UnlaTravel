package com.unla.travelweb.models;

public class ClaseModel {

	private long id;
	
	private String nombre;
	
	private double porcentajeAumento;

	public ClaseModel(String nombre, double porcentajeAumento) {
		this.nombre = nombre;
		this.porcentajeAumento = porcentajeAumento;
	}

	public long getIdClase() {
		return id;
	}

	public void setIdClase(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPorcentajeAumento() {
		return porcentajeAumento;
	}

	public void setPorcentajeAumento(double porcentajeAumento) {
		this.porcentajeAumento = porcentajeAumento;
	}
	
}
