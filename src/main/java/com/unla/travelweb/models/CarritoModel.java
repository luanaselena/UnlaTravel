package com.unla.travelweb.models;

import java.util.ArrayList;
import java.util.List;

import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.entities.ReservaActividad;
import com.unla.travelweb.entities.ReservaHotel;
import com.unla.travelweb.entities.Vuelo;

public class CarritoModel {
	private long id;
	
	private List<Paquete> paquetes = new ArrayList<Paquete>();
	
	private List<ReservaHotel> hoteles = new ArrayList<ReservaHotel>();
	
	private List<Vuelo> vuelos =  new ArrayList<Vuelo>();

	private List<ReservaActividad> actividades = new ArrayList<ReservaActividad>();

	
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

	public List<ReservaHotel> getHoteles() {
		return hoteles;
	}

	public void setHoteles(List<ReservaHotel> hoteles) {
		this.hoteles = hoteles;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public List<ReservaActividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<ReservaActividad> actividades) {
		this.actividades = actividades;
	}

	

	
	
	

}
