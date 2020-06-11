package com.unla.travelweb.services;

import com.unla.travelweb.entities.ReservaHotel;
import com.unla.travelweb.models.HotelModel;
import com.unla.travelweb.models.ReservaHotelModel;

import java.util.List;

public interface IReservaHotelService {
	
	public List<ReservaHotel> getAll();
	public ReservaHotelModel findById(long id);
	public ReservaHotelModel findByNombre(String nombre);
	public ReservaHotelModel insert(ReservaHotelModel hotelModel);
	public ReservaHotelModel update(ReservaHotelModel hotelModel);
	public boolean remove(long id);
}
