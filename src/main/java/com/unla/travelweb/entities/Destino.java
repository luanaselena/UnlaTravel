package com.unla.travelweb.entities;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;
import java.io.Serializable;

import java.util.HashSet;

public class Destino {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	@Column(name="pais", nullable=false)
	private String pais;
	
	@OneToMany(mappedBy="destino")
	private Set<Actividad> actividades;

	public Destino() {
	}
	
	public Destino(String nombre, String pais, Set<Actividad> actividades) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.actividades = actividades;
	}
	
	public Destino(int id, String nombre, String pais, Set<Actividad> actividades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.actividades = actividades;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Set<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(Set<Actividad> actividades) {
		this.actividades = actividades;
	}
	
}
