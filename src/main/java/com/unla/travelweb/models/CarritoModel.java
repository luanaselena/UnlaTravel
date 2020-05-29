package com.unla.travelweb.models;

import java.util.HashSet;
import java.util.Set;

import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.entities.Vuelo;

public class CarritoModel {
	private long id;
	
	private Set<Paquete> paquetes = new HashSet<>();
	
	private Set<Hotel> hoteles = new HashSet<>();
	
	private Set<Vuelo> vuelos = new HashSet<>();
	
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

	public Set<Paquete> getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(Set<Paquete> paquetes) {
		this.paquetes = paquetes;
	}

	public Set<Hotel> getHoteles() {
		return hoteles;
	}

	public void setHoteles(Set<Hotel> hoteles) {
		this.hoteles = hoteles;
	}

	public Set<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(Set<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	
	
	

}
