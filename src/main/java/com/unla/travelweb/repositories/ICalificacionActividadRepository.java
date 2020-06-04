package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.CalificacionActividad;

@Repository("calificacionActividadRepository")
public interface ICalificacionActividadRepository extends JpaRepository <CalificacionActividad, Serializable>{
	public abstract CalificacionActividad findById(long idCalificacion);
}