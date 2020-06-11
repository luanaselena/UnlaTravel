package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.ReservaActividad;

@Repository("reservaActividadRepository")
public interface IReservaActividadRepository extends JpaRepository <ReservaActividad, Serializable>{
	public abstract ReservaActividad findById(long idActividad);
}

