package com.unla.travelweb.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.models.ActividadModel;

@Component ("actividadConverter")
public class ActividadConverter {
	
	@Autowired
	@Qualifier("destinoConverter")
	private DestinoConverter destinoConverter;
	
	public ActividadModel entityToModel (Actividad actividad) {
		return new ActividadModel (actividad.getId(),actividad.getNombre(),actividad.getFecha(), actividad.getValoracion(), 
				actividad.isAccesibilidad(), destinoConverter.entityToModel(actividad.getDestino()), actividad.getPrecio(), actividad.getImgPath());
	}
	
	public Actividad modelToEntity (ActividadModel actividadModel) {
		return new Actividad (actividadModel.getId(),actividadModel.getNombre(), actividadModel.getFecha(), actividadModel.getValoracion(), 
				actividadModel.isAccesibilidad(), destinoConverter.modelToEntity(actividadModel.getDestino()), actividadModel.getPrecio(), actividadModel.getImgPath());
	}

}
