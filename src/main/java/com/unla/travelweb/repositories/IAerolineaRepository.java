package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.Aerolinea;

@Repository("aerolineaRepository")
public interface IAerolineaRepository extends JpaRepository<Aerolinea, Serializable>{
	public abstract Aerolinea findById(long idAerolinea);

}
