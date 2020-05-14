package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.models.ActividadModel;

@Component ("actividadConverter")
public class ActividadConverter {
	
	public ActividadModel entityToModel (Actividad actividad) {
		return new ActividadModel (actividad.getNombre(), actividad.getFecha(), actividad.getValoracion(), 
				actividad.isAccesibilidad(), actividad.getDestino());
	}
	
	public Actividad modelToEntity (ActividadModel actividadModel) {
		return new Actividad (actividadModel.getNombre(), actividadModel.getFecha(), actividadModel.getValoracion(), 
				actividadModel.isAccesibilidad(), actividadModel.getDestino());
	}

}
