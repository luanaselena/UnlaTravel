package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.ReservaActividad;
import com.unla.travelweb.models.ReservaActividadModel;

public interface IReservaActividadService {
	
	public List<ReservaActividad> getAll();
	public ReservaActividadModel findById(long id);
	public ReservaActividadModel insert(ReservaActividadModel actividadModel);
	public ReservaActividadModel update(ReservaActividadModel actividadModel);
	public boolean remove(long id);
}