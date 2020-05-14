package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.models.ActividadModel;

public interface IActividadService {
	
	public List<Actividad> getAll();
	public ActividadModel findById(long id);
	public ActividadModel insert(ActividadModel actividadModel);
	public ActividadModel update(ActividadModel actividadModel);
	public boolean remove(long id);
}