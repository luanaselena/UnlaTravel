package com.unla.travelweb.models;

import java.util.ArrayList;
import java.util.List;

import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.entities.Vuelo;

public class PaqueteModel {

	private long id;
	private VueloModel vuelo;
	private HotelModel hotel;
	private List<ActividadModel> actividades = new ArrayList<ActividadModel>();
	public PaqueteModel() {
		
	}
	
	public PaqueteModel(long id, VueloModel vuelo, HotelModel hotel) {
		super();
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
	public VueloModel getVuelo() {
		return vuelo;
	}
	public void setVuelo(VueloModel vuelo) {
		this.vuelo = vuelo;
	}
	public HotelModel getHotel() {
		return hotel;
	}
	public void setHotel(HotelModel hotel) {
		this.hotel = hotel;
	}

	public List<ActividadModel> getActividades() {
		return actividades;
	}

	public void setActividades(List<ActividadModel> actividades) {
		this.actividades = actividades;
	}
	

}
