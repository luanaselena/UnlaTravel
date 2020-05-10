package com.unla.travelweb.models;

import java.util.Set;


import com.unla.travelweb.entities.Actividad;

public class DestinoModel {

	private int id;
	
	private String nombre;

	private String pais;

	private Set<Actividad> actividades;

	public DestinoModel() {
	}
	
	public DestinoModel(String nombre, String pais, Set<Actividad> actividades) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.actividades = actividades;
	}
	
	public DestinoModel(int id, String nombre, String pais, Set<Actividad> actividades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.actividades = actividades;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
