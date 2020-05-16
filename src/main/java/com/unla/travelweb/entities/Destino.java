package com.unla.travelweb.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name="destino")
public class Destino {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	@Column(name="pais", nullable=false)
	private String pais;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="destino")
	private Set<Actividad> actividades = new HashSet<Actividad>();

	public Destino() {
	}
	
	public Destino(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public Destino(long id, String nombre, String pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
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
