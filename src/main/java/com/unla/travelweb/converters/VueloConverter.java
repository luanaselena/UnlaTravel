package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Vuelo;
import com.unla.travelweb.models.VueloModel;

@Component("vueloConverter")
public class VueloConverter {

	public VueloModel entityToModel(Vuelo vuelo) {
		return new VueloModel(vuelo.getId(), vuelo.getFechaIda(), vuelo.getFechaVuelta(),
				vuelo.getValoracionAerolinea(), vuelo.getClase(), vuelo.isEscalaIncluida());
	}

	public Vuelo modelToEntity(VueloModel vueloModel) {
		return new Vuelo(vueloModel.getId(), vueloModel.getFechaIda(), vueloModel.getFechaVuelta(),
				vueloModel.getValoracionAerolinea(), vueloModel.getClase(), vueloModel.isEscalaIncluida());
	}

}
