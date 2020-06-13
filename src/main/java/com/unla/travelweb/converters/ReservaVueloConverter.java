package com.unla.travelweb.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.ReservaVuelo;
import com.unla.travelweb.models.ReservaVueloModel;

@Component("reservaVueloConverter")
public class ReservaVueloConverter {

	@Autowired
	@Qualifier("destinoConverter")
	private DestinoConverter destinoConverter;

	@Autowired
	@Qualifier("claseConverter")
	private ClaseConverter claseConverter;

	@Autowired
	@Qualifier("aerolineaConverter")
	private AerolineaConverter aerolineaConverter;

	public ReservaVueloModel entityToModel(ReservaVuelo vuelo) {
		if (vuelo.getFechaVuelta() != null) {
			return new ReservaVueloModel(vuelo.getId(), vuelo.getFechaIda(), vuelo.getFechaVuelta(),
					aerolineaConverter.entityToModel(vuelo.getAerolinea()),
					claseConverter.entityToModel(vuelo.getClase()), vuelo.isEscalaIncluida(),
					destinoConverter.entityToModel(vuelo.getOrigen()),
					destinoConverter.entityToModel(vuelo.getDestino()), vuelo.getPrecio(), vuelo.getCantPersonas());

		} else {
			return new ReservaVueloModel(vuelo.getId(), vuelo.getFechaIda(),
					aerolineaConverter.entityToModel(vuelo.getAerolinea()),
					claseConverter.entityToModel(vuelo.getClase()), vuelo.isEscalaIncluida(),
					destinoConverter.entityToModel(vuelo.getOrigen()),
					destinoConverter.entityToModel(vuelo.getDestino()), vuelo.getPrecio(), vuelo.getCantPersonas());
		}
	}

	public ReservaVuelo modelToEntity(ReservaVueloModel vueloModel) {
		if (vueloModel.getFechaVuelta() != null) {
			return new ReservaVuelo(vueloModel.getId(), vueloModel.getFechaIda(), vueloModel.getFechaVuelta(),
					aerolineaConverter.modelToEntity(vueloModel.getAerolinea()),
					claseConverter.modelToEntity(vueloModel.getClase()), vueloModel.isEscalaIncluida(),
					destinoConverter.modelToEntity(vueloModel.getOrigen()),
					destinoConverter.modelToEntity(vueloModel.getDestino()), vueloModel.getPrecio(),
					vueloModel.getCantPersonas());

		}
		else {
			return new ReservaVuelo(vueloModel.getId(), vueloModel.getFechaIda(),
					aerolineaConverter.modelToEntity(vueloModel.getAerolinea()),
					claseConverter.modelToEntity(vueloModel.getClase()), vueloModel.isEscalaIncluida(),
					destinoConverter.modelToEntity(vueloModel.getOrigen()),
					destinoConverter.modelToEntity(vueloModel.getDestino()), vueloModel.getPrecio(),
					vueloModel.getCantPersonas());
		}
	}

}
