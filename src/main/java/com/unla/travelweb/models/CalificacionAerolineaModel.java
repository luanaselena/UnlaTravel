package com.unla.travelweb.models;

import com.unla.travelweb.entities.Aerolinea;

public class CalificacionAerolineaModel {

	private long id;
	
	private double valoracion;
	
	private AerolineaModel aerolinea;
	
	public CalificacionAerolineaModel() {
		
	}

	public CalificacionAerolineaModel(long id, double valoracion, AerolineaModel aerolinea) {
		this.id = id;
		this.valoracion = valoracion;
		this.aerolinea = aerolinea;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	public AerolineaModel getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(AerolineaModel aerolinea) {
		this.aerolinea = aerolinea;
	}
	
	
}
