package com.unla.travelweb.converters;

import com.unla.travelweb.entities.Carrito;
import com.unla.travelweb.models.CarritoModel;

import org.springframework.stereotype.Component;

@Component ("carritoConverter")
public class CarritoConverter {
	
	public CarritoModel entityToModel (Carrito carrito) {
		return new CarritoModel (carrito.getId(), carrito.getReservas());
	}
	
	public Carrito modelToEntity (CarritoModel carritoModel) {
		return new Carrito (carritoModel.getId(), carritoModel.getReservas());
	}
}
