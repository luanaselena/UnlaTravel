package com.unla.travelweb.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.ReservaActividad;
import com.unla.travelweb.models.ReservaActividadModel;

@Component ("reservaActividadConverter")
public class ReservaActividadConverter {
	
	@Autowired
	@Qualifier("destinoConverter")
	private DestinoConverter destinoConverter;
	
	public ReservaActividadModel entityToModel (ReservaActividad actividad) {
		return new ReservaActividadModel (actividad.getId(),actividad.getNombre(),actividad.getFecha(), actividad.getValoracion(), 
				actividad.isAccesibilidad(), destinoConverter.entityToModel(actividad.getDestino()), actividad.getPrecio(), actividad.getImgPath());
	}
	
	public ReservaActividad modelToEntity (ReservaActividadModel actividadModel) {
		return new ReservaActividad (actividadModel.getId(),actividadModel.getNombre(), actividadModel.getFecha(), actividadModel.getValoracion(), 
				actividadModel.isAccesibilidad(), destinoConverter.modelToEntity(actividadModel.getDestino()), actividadModel.getPrecio(), actividadModel.getImgPath());
	}

}
