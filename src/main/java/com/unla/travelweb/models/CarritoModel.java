package com.unla.travelweb.models;

import java.util.HashSet;
import java.util.Set;

import com.unla.travelweb.entities.Paquete;

public class CarritoModel {
	private long id;
	
	private Set<Paquete> reservas = new HashSet<>();
	
	public CarritoModel() {}

	public CarritoModel(long id, Set<Paquete> reservas) {
		super();
		this.id = id;
		this.reservas = reservas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Paquete> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Paquete> reservas) {
		this.reservas = reservas;
	}
	
	

}
