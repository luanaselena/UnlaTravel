package com.unla.travelweb.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.models.PaqueteModel;

@Component("paqueteConverter")
public class PaqueteConverter {
	
	@Autowired
	@Qualifier("hotelConverter")
	private HotelConverter hotelConverter;
	@Autowired
	@Qualifier("vueloConverter")
	private VueloConverter vueloConverter;
	
	public PaqueteModel entityToModel (Paquete paquete) {
		return new PaqueteModel(paquete.getId(), vueloConverter.entityToModel(paquete.getVuelo()), hotelConverter.entityToModel(paquete.getHotel()));
	}
	
	public Paquete modelToEntity (PaqueteModel paqueteModel) {
		return new Paquete(paqueteModel.getId(), vueloConverter.modelToEntity(paqueteModel.getVuelo()), hotelConverter.modelToEntity(paqueteModel.getHotel()));
	}
}
