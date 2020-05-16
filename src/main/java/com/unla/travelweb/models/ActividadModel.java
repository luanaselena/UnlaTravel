package com.unla.travelweb.models;

import java.sql.Date;

import com.unla.travelweb.entities.Destino;

public class ActividadModel {
	
    private long id;

    private String nombre;
    
	private Date fecha;

	private double valoracion;

    private boolean accesibilidad;

    private DestinoModel destino;

    public ActividadModel() {}
    
    public ActividadModel(String nombre, Date fecha, double valoracion, boolean accesibilidad, DestinoModel destino) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.valoracion = valoracion;
		this.accesibilidad = accesibilidad;
		this.destino = destino;
	}
    
	public ActividadModel(long id, String nombre, Date fecha, double valoracion, boolean accesibilidad, DestinoModel destino) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.fecha = fecha;
		this.valoracion = valoracion;
		this.accesibilidad = accesibilidad;
		this.destino = destino;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	public boolean isAccesibilidad() {
		return accesibilidad;
	}

	public void setAccesibilidad(boolean accesibilidad) {
		this.accesibilidad = accesibilidad;
	}

	public DestinoModel getDestino() {
		return destino;
	}

	public void setDestino(DestinoModel destino) {
		this.destino = destino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
