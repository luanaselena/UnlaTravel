package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.models.PaqueteModel;


public interface IPaqueteService {
	public List<Paquete> getAll();
	public PaqueteModel findById(long id);
	public PaqueteModel insert(PaqueteModel paqueteModel);
	public PaqueteModel update(PaqueteModel paqueteModel);
	public boolean remove(long id);
}
