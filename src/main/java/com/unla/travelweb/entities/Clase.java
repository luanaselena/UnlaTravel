package com.unla.travelweb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clase")
public class Clase {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
    @Column(name="nombre")
	private String nombre;
    
    @Column(name="porcentaje_aumento")
	private double porcentajeAumento;

    public Clase() {}
    
	public Clase(String nombre, double porcentajeAumento) {
		this.nombre = nombre;
		this.porcentajeAumento = porcentajeAumento;
	}
	
	public Clase(long id, String nombre, double porcentajeAumento) {
		this.id = id;
		this.nombre = nombre;
		this.porcentajeAumento = porcentajeAumento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPorcentajeAumento() {
		return porcentajeAumento;
	}

	public void setPorcentajeAumento(double porcentajeAumento) {
		this.porcentajeAumento = porcentajeAumento;
	}
	
	
	
}
