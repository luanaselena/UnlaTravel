package com.unla.travelweb.models;

public class AerolineaModel {
	
	private long id;
	private String nombre;
	private int valoracion;
	
	public AerolineaModel(String nombre, int valoracion) {
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	public long getIdAerolinea() {
		return id;
	}

	public void setIdAerolinea(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	
	
}
