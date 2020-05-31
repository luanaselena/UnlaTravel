package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.Clase;
import com.unla.travelweb.models.ClaseModel;

public interface IClaseService {

	public List<Clase> getAll();
	public ClaseModel findById(long idClase);
	/*public ClaseModel insert(ClaseModel claseModel);*/
	public ClaseModel update(ClaseModel claseModel);
	public boolean remove(long id);

}
