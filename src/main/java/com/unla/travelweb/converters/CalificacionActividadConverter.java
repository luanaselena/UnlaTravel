package com.unla.travelweb.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.CalificacionActividad;
import com.unla.travelweb.models.CalificacionActividadModel;

@Component("calificacionActividadConverter")
public class CalificacionActividadConverter {
	
	@Autowired
	@Qualifier("actividadConverter")
	private ActividadConverter actividadConverter;
	
	public CalificacionActividadModel entityToModel (CalificacionActividad calificacion) {
		return new CalificacionActividadModel(calificacion.getId(),calificacion.getValoracion(), actividadConverter.entityToModel(calificacion.getActividad()));
	}
	
	public CalificacionActividad modelToEntity (CalificacionActividadModel calificacion) {
		return new CalificacionActividad(calificacion.getId(),calificacion.getValoracion(), actividadConverter.modelToEntity(calificacion.getActividad()));
	}
}
