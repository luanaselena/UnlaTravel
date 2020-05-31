package com.unla.travelweb.models;

public class ClaseModel {

	private long id;
	
	private String nombre;
	
	private double porcentajeAumento;

	public ClaseModel() {}
	
	public ClaseModel(String nombre, double porcentajeAumento) {
		this.nombre = nombre;
		this.porcentajeAumento = porcentajeAumento;
	}
	
	public ClaseModel(long id, String nombre, double porcentajeAumento) {
		this.id = id;
		this.nombre = nombre;
		this.porcentajeAumento = porcentajeAumento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
