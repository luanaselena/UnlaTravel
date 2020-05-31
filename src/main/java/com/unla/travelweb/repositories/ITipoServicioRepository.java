package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.TipoServicio;

@Repository("tipoServicioRepository")
public interface ITipoServicioRepository extends JpaRepository<TipoServicio, Serializable>{
	public abstract TipoServicio findById(long idServicio);
	public abstract TipoServicio findByTipo(String tipo);
}
