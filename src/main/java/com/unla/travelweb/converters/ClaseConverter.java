package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Clase;
import com.unla.travelweb.models.ClaseModel;

@Component ("claseConverter")
public class ClaseConverter {
	
	public ClaseModel entityToModel (Clase clase) {
		return new ClaseModel(clase.getNombre(), clase.getPorcentajeAumento());
	}
	
	public Clase modelToEntity (ClaseModel clase) {
		return new Clase(clase.getNombre(),clase.getPorcentajeAumento());
	}
	
}
