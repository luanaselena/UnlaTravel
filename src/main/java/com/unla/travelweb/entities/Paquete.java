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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="paquete")
public class Paquete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE/*,CascadeType.PERSIST*/}, optional=true)
	@JoinColumn(name = "vuelo_id", referencedColumnName = "id")
	private Vuelo vuelo;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE/*,CascadeType.PERSIST*/}, optional=true)
	@JoinColumn(name = "hotel_id", referencedColumnName = "id")
	private Hotel hotel;
	
	
	@ManyToMany(mappedBy = "listaPaquetes", cascade = CascadeType.MERGE)
	private List<Actividad> actividades = new ArrayList<Actividad>();
	
	public Paquete() {
		
	}
	
	public Paquete(long id, Vuelo vuelo, Hotel hotel) {
		this.id = id;
		this.vuelo = vuelo;
		this.hotel = hotel;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	
	
}
