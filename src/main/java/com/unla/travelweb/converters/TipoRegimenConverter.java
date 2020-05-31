package com.unla.travelweb.converters;

import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.TipoRegimen;
import com.unla.travelweb.models.TipoRegimenModel;

@Component ("tipoRegimenConverter")
public class TipoRegimenConverter {

	public TipoRegimenModel entityToModel (TipoRegimen regimen) {
		return new TipoRegimenModel(regimen.getId(), regimen.getPorcentajeAumento(), regimen.getTipo());
	}
	
	public TipoRegimen modelToEntity (TipoRegimenModel regimen) {
		return new TipoRegimen(regimen.getId(), regimen.getTipo(), regimen.getPorcentajeAumento());
	}
}
