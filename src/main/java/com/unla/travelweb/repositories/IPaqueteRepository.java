package com.unla.travelweb.repositories;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.Paquete;

@Repository("paqueteRepository")
public interface IPaqueteRepository extends JpaRepository<Paquete, Serializable>{
	public abstract Paquete findById(long idPaquete);
}
