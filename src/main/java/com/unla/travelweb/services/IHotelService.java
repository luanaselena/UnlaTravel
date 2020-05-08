package com.unla.travelweb.services;

import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.models.HotelModel;
import java.util.List;

public interface IHotelService {
	
	public List<Hotel> getAll();
	public HotelModel findById(long id);
	public HotelModel insert(HotelModel hotelModel);
	public HotelModel update(HotelModel hotelModel);
	public boolean remove(long id);
}
