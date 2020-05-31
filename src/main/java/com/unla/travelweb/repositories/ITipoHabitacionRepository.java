package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.TipoHabitacion;

@Repository("tipoHabitacionRepository")
public interface ITipoHabitacionRepository extends JpaRepository<TipoHabitacion, Serializable>{
	public abstract TipoHabitacion findById(long idServicio);
	public abstract TipoHabitacion findByTipo(String tipo);
}
