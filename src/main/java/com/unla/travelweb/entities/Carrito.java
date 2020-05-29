package com.unla.travelweb.entities;

import java.util.HashSet;
import java.util.Set;

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
	private Set<Paquete> paquetes = new HashSet<>();
	
	@OneToMany(fetch = FetchType.LAZY)
	private Set<Hotel> hoteles = new HashSet<>();
	
	@OneToMany(fetch = FetchType.LAZY)
	private Set<Vuelo> vuelos = new HashSet<>();
	
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
