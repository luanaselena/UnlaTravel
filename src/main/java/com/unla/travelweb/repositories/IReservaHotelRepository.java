package com.unla.travelweb.repositories;

import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.entities.ReservaHotel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("reservaHotelRepository")
public interface IReservaHotelRepository extends JpaRepository <ReservaHotel, Serializable>{
	public abstract ReservaHotel findById(long idHotel);
	public abstract ReservaHotel findByNombre(String nombre);
}
