package com.unla.travelweb.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Vuelo;
import com.unla.travelweb.models.VueloModel;

@Component("vueloConverter")
public class VueloConverter {

	@Autowired
	@Qualifier("destinoConverter")
	private DestinoConverter destinoConverter;

	public VueloModel entityToModel(Vuelo vuelo) {
		return new VueloModel(vuelo.getId(), vuelo.getFechaIda(), vuelo.getFechaVuelta(),
				vuelo.getValoracionAerolinea(), vuelo.getClase(), vuelo.isEscalaIncluida(),
				destinoConverter.entityToModel(vuelo.getOrigen()), destinoConverter.entityToModel(vuelo.getDestino()));
	}

	public Vuelo modelToEntity(VueloModel vueloModel) {
		return new Vuelo(vueloModel.getId(), vueloModel.getFechaIda(), vueloModel.getFechaVuelta(),
				vueloModel.getValoracionAerolinea(), vueloModel.getClase(), vueloModel.isEscalaIncluida(),
				destinoConverter.modelToEntity(vueloModel.getOrigen()),
				destinoConverter.modelToEntity(vueloModel.getDestino()));
	}

}
