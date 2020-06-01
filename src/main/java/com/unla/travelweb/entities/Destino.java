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
	
	@Column(name="latitud", nullable=true)
	private long latitud;
	
	@Column(name="longitud", nullable=true)
	private long longitud;

	public Destino() {
	}
	
	public Destino(String nombre, String pais, long latitud, long longitud) {
		this.nombre = nombre;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	

	public Destino(long id, String nombre, String pais, long latitud, long longitud) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
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

	public long getLatitud() {
		return latitud;
	}

	public void setLatitud(long latitud) {
		this.latitud = latitud;
	}

	public long getLongitud() {
		return longitud;
	}

	public void setLongitud(long longitud) {
		this.longitud = longitud;
	}
	
	
	
}
