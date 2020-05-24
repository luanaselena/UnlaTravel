package com.unla.travelweb.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.travelweb.entities.Carrito;

@Repository("carritoRepository")
public interface ICarritoRepository extends JpaRepository <Carrito, Serializable>{
	public abstract Carrito findById(long idCarrito);
}
