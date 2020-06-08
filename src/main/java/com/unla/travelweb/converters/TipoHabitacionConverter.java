package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.TipoHabitacion;
import com.unla.travelweb.models.TipoHabitacionModel;

@Component ("tipoHabitacionConverter")
public class TipoHabitacionConverter {

	
	public TipoHabitacionModel entityToModel (TipoHabitacion habitacion) {
		if(habitacion!=null) {
			return new TipoHabitacionModel(habitacion.getId(), habitacion.getPorcentajeAumento(), habitacion.getTipo());
		}
		else return null;
	}
	
	public TipoHabitacion modelToEntity (TipoHabitacionModel habitacion) {
		if(habitacion!=null) {
			return new TipoHabitacion(habitacion.getId(), habitacion.getTipo(), habitacion.getPorcentajeAumento());
		}
		else return null;
	}
}
