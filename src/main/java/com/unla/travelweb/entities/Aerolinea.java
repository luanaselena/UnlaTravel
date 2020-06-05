package com.unla.travelweb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aerolinea")
public class Aerolinea {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
    @Column(name="nombre")
	private String nombre;
    
    @Column(name="valoracion")
	private double valoracion;
	
	public Aerolinea() {}
	
	public Aerolinea(String nombre, double valoracion) {
		this.nombre = nombre;
		this.valoracion = valoracion;
	}
	
	public Aerolinea(long id, String nombre, double valoracion) {
		this.id = id;
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	public long getId() {
		return id;
	}


	public void setId(long idAerolinea) {
		this.id = idAerolinea;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getValoracion() {
		return valoracion;
	}


	public void setValoracion(double d) {
		this.valoracion = d;
	}
	
	
	
}
