package com.unla.travelweb.models;

import java.util.Set;

import com.unla.travelweb.entities.Actividad;

public class DestinoModel {

	private long id;
	
	private String nombre;

	private String pais;

	private Set<Actividad> actividades;

	private double latitud;
	
	private double longitud;

	public DestinoModel() {
	}
	
	public DestinoModel(String nombre, String pais, double latitud, double longitud) {
		this.nombre = nombre;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	

	public DestinoModel(long id, String nombre, String pais, double latitud, double longitud) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Set<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(Set<Actividad> actividades) {
		this.actividades = actividades;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	

}
