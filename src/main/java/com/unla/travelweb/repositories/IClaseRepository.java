package com.unla.travelweb.repositories;

import java.io.Serializable;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.travelweb.entities.Clase;

@Repository("claseRepository")
public interface IClaseRepository extends JpaRepository<Clase, Serializable>{
	public abstract Clase findById(long idClase);
}
