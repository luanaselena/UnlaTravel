package com.unla.travelweb.models;

public class AerolineaModel {
	
	private long id;
	private String nombre;
	private double valoracion;
	
	public AerolineaModel() {}

	public AerolineaModel(String nombre, double valoracion) {
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	public AerolineaModel(long id, String nombre, double valoracion) {
		this.id = id;
		this.nombre = nombre;
		this.valoracion = valoracion;
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

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}
	
	
	
}
