package com.unla.travelweb.models;

import java.util.Set;


import com.unla.travelweb.entities.Actividad;

public class DestinoModel {

	private long id;
	
	private String nombre;

	private String pais;

	private Set<Actividad> actividades;

	public DestinoModel() {
	}
	
	public DestinoModel(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public DestinoModel(long id, String nombre, String pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
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

}
