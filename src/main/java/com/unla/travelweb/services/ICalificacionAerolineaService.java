package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.CalificacionAerolinea;
import com.unla.travelweb.models.CalificacionAerolineaModel;

public interface ICalificacionAerolineaService {

	public List<CalificacionAerolinea> getAll();
	public CalificacionAerolineaModel findById(long idCalificacion);
	public CalificacionAerolineaModel insert(CalificacionAerolineaModel calificacionAerolinea);
	public boolean remove(long id);

}
