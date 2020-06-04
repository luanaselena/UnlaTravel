package com.unla.travelweb.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.CalificacionAerolinea;
import com.unla.travelweb.models.CalificacionAerolineaModel;

@Component("calificacionAerolineaConverter")
public class CalificacionAerolineaConverter {

	@Autowired
	@Qualifier("aerolineaConverter")
	private AerolineaConverter aerolineaConverter;
	
	public CalificacionAerolineaModel entityToModel (CalificacionAerolinea calificacion) {
		return new CalificacionAerolineaModel(calificacion.getId(),calificacion.getValoracion(), aerolineaConverter.entityToModel(calificacion.getAerolinea()));
	}
	
	public CalificacionAerolinea modelToEntity (CalificacionAerolineaModel calificacion) {
		return new CalificacionAerolinea(calificacion.getId(),calificacion.getValoracion(), aerolineaConverter.modelToEntity(calificacion.getAerolinea()));
	}
}
