package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.TipoHabitacion;
import com.unla.travelweb.models.TipoHabitacionModel;

public interface ITipoHabitacionService {
	public List<TipoHabitacion> getAll();
	public TipoHabitacionModel findById(long idHabitacion);
	public TipoHabitacionModel findByTipo(String tipo);
	public TipoHabitacionModel insert(TipoHabitacionModel habitacion);
	public TipoHabitacionModel update(TipoHabitacionModel habitacion);
	public boolean remove(long id);
}
