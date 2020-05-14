package com.unla.travelweb.models;

import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.entities.Vuelo;

public class PaqueteModel {

	private long id;
	private Vuelo vuelo;
	private Hotel hotel;
	
	public PaqueteModel() {
		
	}
	
	public PaqueteModel(long id, Vuelo vuelo, Hotel hotel) {
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
	

}
