package com.unla.travelweb.models;

import java.time.LocalDate;

import com.unla.travelweb.entities.Destino;

public class ActividadModel {
	
    private long id;

	private String nombre;

	private LocalDate fecha;

	private int valoracion;

    private boolean accesibilidad;

    private Destino destino;

    public ActividadModel() {}
    
    public ActividadModel(String nombre, LocalDate fecha, int valoracion, boolean accesibilidad, Destino destino) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.valoracion = valoracion;
		this.accesibilidad = accesibilidad;
		this.destino = destino;
	}
    
	public ActividadModel(long id, String nombre, LocalDate fecha, int valoracion, boolean accesibilidad, Destino destino) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public boolean isAccesibilidad() {
		return accesibilidad;
	}

	public void setAccesibilidad(boolean accesibilidad) {
		this.accesibilidad = accesibilidad;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

}
