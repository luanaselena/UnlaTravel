package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.models.PaqueteModel;

@Component("paqueteConverter")
public class PaqueteConverter {
	public PaqueteModel entityToModel (Paquete paquete) {
		return new PaqueteModel(paquete.getId(), paquete.getVuelo(), paquete.getHotel());
	}
	
	public Paquete modelToEntity (PaqueteModel paqueteModel) {
		return new Paquete(paqueteModel.getId(), paqueteModel.getVuelo(), paqueteModel.getHotel());
	}
}
