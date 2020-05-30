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
	
	@Autowired
	@Qualifier("claseConverter")
	private ClaseConverter claseConverter;
	
	@Autowired
	@Qualifier("aerolineaConverter")
	private AerolineaConverter aerolineaConverter;

	public VueloModel entityToModel(Vuelo vuelo) {
		return new VueloModel(vuelo.getId(), vuelo.getFechaIda(), vuelo.getFechaVuelta(),
				aerolineaConverter.entityToModel(vuelo.getAerolinea()), claseConverter.entityToModel(vuelo.getClase()), vuelo.isEscalaIncluida(),
				destinoConverter.entityToModel(vuelo.getOrigen()), destinoConverter.entityToModel(vuelo.getDestino()), vuelo.getPrecio());
	}

	public Vuelo modelToEntity(VueloModel vueloModel) {
		return new Vuelo(vueloModel.getId(), vueloModel.getFechaIda(), vueloModel.getFechaVuelta(),
				aerolineaConverter.modelToEntity(vueloModel.getAerolinea()), claseConverter.modelToEntity(vueloModel.getClase()), vueloModel.isEscalaIncluida(),
				destinoConverter.modelToEntity(vueloModel.getOrigen()),
				destinoConverter.modelToEntity(vueloModel.getDestino()), vueloModel.getPrecio());
	}

}
