package com.unla.travelweb.repositories;

import com.unla.travelweb.entities.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("destinoRepository")
public interface IDestinoRepository extends JpaRepository <Destino, Serializable>{
	public abstract Destino findById(long idDestino);
}
