package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.CalificacionAerolinea;

@Repository("calificacionAerolineaRepository")
public interface ICalificacionAerolineaRepository extends JpaRepository <CalificacionAerolinea, Serializable>{
	public abstract CalificacionAerolinea findById(long idCalificacion);
}
