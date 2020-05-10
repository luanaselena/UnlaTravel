package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.Destino;
import com.unla.travelweb.models.DestinoModel;

public interface IDestinoService {
	
	public List<Destino> getAll();
	public DestinoModel findById(long id);
	public DestinoModel insert(DestinoModel destinoModel);
	public DestinoModel update(DestinoModel destinoModel);
	public boolean remove(long id);
}