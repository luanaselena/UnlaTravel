package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.TipoAlojamiento;
import com.unla.travelweb.models.TipoAlojamientoModel;

@Component ("tipoAlojamientoConverter")
public class TipoAlojamientoConverter {

	
	public TipoAlojamientoModel entityToModel (TipoAlojamiento alojamiento) {
		return new TipoAlojamientoModel(alojamiento.getId(), alojamiento.getPorcentajeAumento(), alojamiento.getTipo());
	}
	
	public TipoAlojamiento modelToEntity (TipoAlojamientoModel alojamiento) {
		return new TipoAlojamiento(alojamiento.getId(), alojamiento.getTipo(), alojamiento.getPorcentajeAumento());
	}
}
