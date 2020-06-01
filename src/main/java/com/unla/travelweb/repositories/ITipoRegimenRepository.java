package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.TipoRegimen;

@Repository("tipoRegimenRepository")
public interface ITipoRegimenRepository extends JpaRepository<TipoRegimen, Serializable>{
	public abstract TipoRegimen findById(long idRegimen);
	public abstract TipoRegimen findByTipo(String tipo);
}
