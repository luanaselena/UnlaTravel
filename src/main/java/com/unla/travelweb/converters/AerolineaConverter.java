package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Aerolinea;
import com.unla.travelweb.models.AerolineaModel;

@Component ("aerolineaConverter")
public class AerolineaConverter {

	public AerolineaModel entityToModel (Aerolinea aerolinea) {
		return new AerolineaModel(aerolinea.getNombre(), aerolinea.getValoracion());
	}
	
	public Aerolinea modelToEntity (AerolineaModel aerolinea) {
		return new Aerolinea(aerolinea.getNombre(), aerolinea.getValoracion());
	}
	
}
