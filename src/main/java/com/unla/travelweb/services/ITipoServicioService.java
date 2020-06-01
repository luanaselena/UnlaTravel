package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.TipoServicio;
import com.unla.travelweb.models.TipoServicioModel;

public interface ITipoServicioService {
	public List<TipoServicio> getAll();
	public TipoServicioModel findById(long idServicio);
	public TipoServicioModel findByTipo(String tipo);
	public TipoServicioModel insert(TipoServicioModel servicio);
	public TipoServicioModel update(TipoServicioModel servicio);
	public boolean remove(long id);
}
