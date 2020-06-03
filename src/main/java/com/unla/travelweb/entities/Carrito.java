package com.unla.travelweb.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Paquete> paquetes = new ArrayList<Paquete>();
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Hotel> hoteles = new ArrayList<Hotel>();
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Vuelo> vuelos = new ArrayList<Vuelo>();
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Actividad> actividades = new ArrayList<Actividad>();
	
	public Carrito() {}

	public Carrito(long id) {
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
