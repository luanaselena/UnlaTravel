package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.CalificacionActividad;
import com.unla.travelweb.models.CalificacionActividadModel;

public interface ICalificacionActividadService {

	public List<CalificacionActividad> getAll();
	public CalificacionActividadModel findById(long idCalificacion);
	public CalificacionActividadModel insert(CalificacionActividadModel calificacionActividad);
	public boolean remove(long id);
}
