package com.unla.travelweb.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Paquete> paquetes = new ArrayList<Paquete>();
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ReservaHotel> hoteles = new ArrayList<ReservaHotel>();
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Vuelo> vuelos = new ArrayList<Vuelo>();
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ReservaActividad> actividades = new ArrayList<ReservaActividad>();
	
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
