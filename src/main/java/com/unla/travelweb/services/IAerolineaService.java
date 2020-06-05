package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.Aerolinea;
import com.unla.travelweb.models.AerolineaModel;

public interface IAerolineaService {

	public List<Aerolinea> getAll();
	public AerolineaModel findById(long idAerolinea);
	/*public AerolineaModel insert(AerolineaModel aerolineaModel);*/
	public AerolineaModel update(AerolineaModel aerolineaModel);
	public boolean remove(long id);
	AerolineaModel insert(AerolineaModel aerolineaModel);

}
