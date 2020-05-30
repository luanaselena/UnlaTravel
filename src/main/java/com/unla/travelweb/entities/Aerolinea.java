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
	private int valoracion;
	
	public Aerolinea() {}
	
	public Aerolinea(String nombre, int valoracion) {
		this.nombre = nombre;
		this.valoracion = valoracion;
	}


	public long getIdAerolinea() {
		return id;
	}


	public void setIdAerolinea(long idAerolinea) {
		this.id = idAerolinea;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getValoracion() {
		return valoracion;
	}


	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	
	
}
