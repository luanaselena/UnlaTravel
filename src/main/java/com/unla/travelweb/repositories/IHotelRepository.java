package com.unla.travelweb.repositories;

import com.unla.travelweb.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("hotelRepository")
public interface IHotelRepository extends JpaRepository <Hotel, Serializable>{
	public abstract Hotel findById(long idHotel);
	public abstract Hotel findByNombre(String nombre);
}
