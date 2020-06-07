package com.unla.travelweb.converters;

import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.models.HotelModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("hotelConverter")
public class HotelConverter
{
	
	@Autowired
	@Qualifier("tipoAlojamientoConverter")
	private TipoAlojamientoConverter tipoAlojamientoConverter;
	
	public HotelModel entityToModel (Hotel hotel) {
		return new HotelModel (hotel.getId(), hotel.getNombre(), 
				hotel.getCantEstrellas(), tipoAlojamientoConverter.entityToModel(hotel.getTipoAlojamiento()), hotel.getTipoServicio(), hotel.getTipoHabitaciones(), 
				hotel.getTipoRegimen(), hotel.isAccesibilidad(), hotel.getCantPersonas(), hotel.getPrecio(), hotel.getImgPath());

	}
	
	public Hotel modelToEntity (HotelModel hotelModel) {
		return new Hotel (hotelModel.getId(), hotelModel.getNombre(), 
				hotelModel.getCantEstrellas(), tipoAlojamientoConverter.modelToEntity(hotelModel.getTipoAlojamiento()),hotelModel.getTipoServicio(), 
				hotelModel.getTipoHabitaciones(), hotelModel.getTipoRegimen(), 
				hotelModel.isAccesibilidad(), hotelModel.getCantPersonas(), hotelModel.getPrecio(), hotelModel.getImgPath());
	}
}
