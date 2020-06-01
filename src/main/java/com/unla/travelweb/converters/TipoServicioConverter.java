package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.TipoServicio;
import com.unla.travelweb.models.TipoServicioModel;

@Component ("tipoServicioConverter")
public class TipoServicioConverter {

	
	public TipoServicioModel entityToModel (TipoServicio servicio) {
		return new TipoServicioModel(servicio.getId(), servicio.getPorcentajeAumento(), servicio.getTipo());
	}
	
	public TipoServicio modelToEntity (TipoServicioModel servicio) {
		return new TipoServicio(servicio.getId(), servicio.getTipo(), servicio.getPorcentajeAumento());
	}
}
