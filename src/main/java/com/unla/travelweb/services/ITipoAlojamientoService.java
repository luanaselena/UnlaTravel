package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.TipoAlojamiento;
import com.unla.travelweb.models.TipoAlojamientoModel;

public interface ITipoAlojamientoService {
	public List<TipoAlojamiento> getAll();
	public TipoAlojamientoModel findById(long idAlojamiento);
	public TipoAlojamientoModel findByTipo(String tipo);
	public TipoAlojamientoModel insert(TipoAlojamientoModel alojamiento);
	public TipoAlojamientoModel update(TipoAlojamientoModel alojamiento);
	public boolean remove(long id);
}
