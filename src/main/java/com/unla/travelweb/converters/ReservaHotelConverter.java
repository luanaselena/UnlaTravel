package com.unla.travelweb.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.travelweb.entities.ReservaHotel;
import com.unla.travelweb.models.ReservaHotelModel;

@Component ("reservaHotelConverter")
public class ReservaHotelConverter{
	
	@Autowired
	@Qualifier("tipoAlojamientoConverter")
	private TipoAlojamientoConverter tipoAlojamientoConverter;
	@Autowired
	@Qualifier("tipoHabitacionConverter")
	private TipoHabitacionConverter tipoHabitacionConverter;
	@Autowired
	@Qualifier("tipoRegimenConverter")
	private TipoRegimenConverter tipoRegimenConverter;
	
	public ReservaHotelModel entityToModel (ReservaHotel hotel) {
		return new ReservaHotelModel (hotel.getId(), hotel.getNombre(), 
				hotel.getCantEstrellas(), tipoAlojamientoConverter.entityToModel(hotel.getTipoAlojamiento()),
				tipoHabitacionConverter.entityToModel(hotel.getTipoHabitacion()),  tipoRegimenConverter.entityToModel(hotel.getTipoRegimen()), 
				hotel.isAccesibilidad(), hotel.getCantPersonas(), hotel.getPrecio(), hotel.getImgPath());

	}
	
	public ReservaHotel modelToEntity (ReservaHotelModel hotelModel) {
		return new ReservaHotel (hotelModel.getId(), hotelModel.getNombre(), 
				hotelModel.getCantEstrellas(), tipoAlojamientoConverter.modelToEntity(hotelModel.getTipoAlojamiento()), 
				tipoHabitacionConverter.modelToEntity(hotelModel.getTipoHabitacion()), tipoRegimenConverter.modelToEntity(hotelModel.getTipoRegimen()), 
				hotelModel.isAccesibilidad(), hotelModel.getCantPersonas(), hotelModel.getPrecio(), hotelModel.getImgPath());
	}
}
