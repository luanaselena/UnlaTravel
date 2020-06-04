package com.unla.travelweb.models;

public class CalificacionActividadModel {
	
	private long id;
	
	private double valoracion;
	
	private ActividadModel actividad;
	
	public CalificacionActividadModel() {}
	
	public CalificacionActividadModel(long id, double valoracion, ActividadModel actividad) {
		this.id = id;
		this.valoracion = valoracion;
		this.actividad = actividad;
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

	public ActividadModel getActividad() {
		return actividad;
	}

	public void setActividad(ActividadModel actividad) {
		this.actividad = actividad;
	}

	
	
}
