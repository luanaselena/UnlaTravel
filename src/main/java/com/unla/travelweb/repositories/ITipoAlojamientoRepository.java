package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.TipoAlojamiento;

@Repository("tipoAlojamientoRepository")
public interface ITipoAlojamientoRepository extends JpaRepository<TipoAlojamiento, Serializable>{
	public abstract TipoAlojamiento findById(long idServicio);
	public abstract TipoAlojamiento findByTipo(String tipo);
}
