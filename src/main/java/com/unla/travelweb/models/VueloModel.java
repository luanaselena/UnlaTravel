package com.unla.travelweb.models;

import java.sql.Date;

public class VueloModel {
	private long id;
	private Date fechaIda;
	private Date fechaVuelta;
//	private Destino origen;
//	private Destino destino;
	private double valoracionAerolinea;
	private int clase;
	private boolean escalaIncluida;
	
	public VueloModel() {}

	public VueloModel(long id, Date fechaIda, Date fechaVuelta, double valoracionAerolinea, int clase,
			boolean escalaIncluida) {
		super();
		this.id = id;
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
		this.valoracionAerolinea = valoracionAerolinea;
		this.clase = clase;
		this.escalaIncluida = escalaIncluida;
	}

	public VueloModel(Date fechaIda, Date fechaVuelta, double valoracionAerolinea, int clase, boolean escalaIncluida) {
		super();
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
		this.valoracionAerolinea = valoracionAerolinea;
		this.clase = clase;
		this.escalaIncluida = escalaIncluida;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaIda() {
		return fechaIda;
	}

	public void setFechaIda(Date fechaIda) {
		this.fechaIda = fechaIda;
	}

	public Date getFechaVuelta() {
		return fechaVuelta;
	}

	public void setFechaVuelta(Date fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
	}

	public double getValoracionAerolinea() {
		return valoracionAerolinea;
	}

	public void setValoracionAerolinea(double valoracionAerolinea) {
		this.valoracionAerolinea = valoracionAerolinea;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public boolean isEscalaIncluida() {
		return escalaIncluida;
	}

	public void setEscalaIncluida(boolean escalaIncluida) {
		this.escalaIncluida = escalaIncluida;
	}

	
	
	
}
