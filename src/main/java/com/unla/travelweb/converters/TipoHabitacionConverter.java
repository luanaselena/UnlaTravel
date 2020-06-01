package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.TipoHabitacion;
import com.unla.travelweb.models.TipoHabitacionModel;

@Component ("tipoHabitacionConverter")
public class TipoHabitacionConverter {

	
	public TipoHabitacionModel entityToModel (TipoHabitacion habitacion) {
		return new TipoHabitacionModel(habitacion.getId(), habitacion.getPorcentajeAumento(), habitacion.getTipo());
	}
	
	public TipoHabitacion modelToEntity (TipoHabitacionModel habitacion) {
		return new TipoHabitacion(habitacion.getId(), habitacion.getTipo(), habitacion.getPorcentajeAumento());
	}
}
