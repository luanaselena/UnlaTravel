package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.Destino;
import com.unla.travelweb.models.DestinoModel;

@Component ("destinoConverter")
public class DestinoConverter
{
	public DestinoModel entityToModel (Destino destino) {
		return new DestinoModel (destino.getId(), destino.getNombre(), 
				destino.getPais());
	}
	
	public Destino modelToEntity (DestinoModel destinoModel) {
		return new Destino (destinoModel.getId(), destinoModel.getNombre(), 
				destinoModel.getPais());
	}
}

