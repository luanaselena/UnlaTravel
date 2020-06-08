package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.TipoRegimen;
import com.unla.travelweb.models.TipoRegimenModel;

@Component ("tipoRegimenConverter")
public class TipoRegimenConverter {

	public TipoRegimenModel entityToModel (TipoRegimen regimen) {
		
		if(regimen!=null) {
			return new TipoRegimenModel(regimen.getId(), regimen.getPorcentajeAumento(), regimen.getTipo());
		}
		else return null;
	}
	
	public TipoRegimen modelToEntity (TipoRegimenModel regimen) {

		if(regimen!=null) {
			return new TipoRegimen(regimen.getId(), regimen.getTipo(), regimen.getPorcentajeAumento());
		}
		else return null;
	}
}
