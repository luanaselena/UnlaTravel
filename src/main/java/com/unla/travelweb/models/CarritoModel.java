package com.unla.travelweb.models;

import java.util.ArrayList;
import java.util.List;

import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.entities.Vuelo;

public class CarritoModel {
	private long id;
	
	private List<Paquete> paquetes = new ArrayList<Paquete>();
	
	private List<Hotel> hoteles = new ArrayList<Hotel>();
	
	private List<Vuelo> vuelos =  new ArrayList<Vuelo>();

	private List<Actividad> actividades = new ArrayList<Actividad>();

	
	public CarritoModel() {}

	public CarritoModel(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Paquete> getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}

	public List<Hotel> getHoteles() {
		return hoteles;
	}

	public void setHoteles(List<Hotel> hoteles) {
		this.hoteles = hoteles;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	

	
	
	

}
