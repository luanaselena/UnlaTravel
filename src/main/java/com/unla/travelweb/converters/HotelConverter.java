package com.unla.travelweb.converters;

import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.models.HotelModel;

import org.springframework.stereotype.Component;

@Component ("hotelConverter")
public class HotelConverter
{
	public HotelModel entityToModel (Hotel hotel) {
		return new HotelModel (hotel.getId(), hotel.getNombre(), 
				hotel.getCantEstrellas(), hotel.getTipoServicio(), hotel.getTipoHabitaciones(), 
				hotel.getTipoRegimen(), hotel.isAccesibilidad(), hotel.getCantPersonas());
	}
	
	public Hotel modelToEntity (HotelModel hotelModel) {
		return new Hotel (hotelModel.getId(), hotelModel.getNombre(), 
				hotelModel.getCantEstrellas(), hotelModel.getTipoServicio(), 
				hotelModel.getTipoHabitaciones(), hotelModel.getTipoRegimen(), 
				hotelModel.isAccesibilidad(), hotelModel.getCantPersonas());
	}
}
