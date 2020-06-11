package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.ReservaVuelo;

@Repository("reservaVueloRepository")
public interface IReservaVueloRepository extends JpaRepository<ReservaVuelo, Serializable>{
	
	public abstract ReservaVuelo findById(long idVuelo);
//	public abstract Vuelo findByDestino(Destino destino);
//	public abstract Vuelo findByOrigen(Destino origen);

	
}
