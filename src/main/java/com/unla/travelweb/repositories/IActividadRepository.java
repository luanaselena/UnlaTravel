package com.unla.travelweb.repositories;

import com.unla.travelweb.entities.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("actividadRepository")
public interface IActividadRepository extends JpaRepository <Actividad, Serializable>{
	public abstract Actividad findById(long id);
}
