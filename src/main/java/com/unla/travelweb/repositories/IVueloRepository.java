package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.Vuelo;

@Repository("vueloRepository")
public interface IVueloRepository extends JpaRepository<Vuelo, Serializable>{
	
	public abstract Vuelo findById(long id);
//  public abstract Vuelo findByDestino(Destino destino);
	
}
