package com.unla.travelweb.services;

import java.util.List;

import com.unla.travelweb.entities.Carrito;
import com.unla.travelweb.models.CarritoModel;

public interface ICarritoService {
	public List<Carrito> getAll();
	public CarritoModel findById(long id);
	public CarritoModel insert(CarritoModel carritoModel);
	public CarritoModel update(CarritoModel carritoModel);
	public boolean remove(long id);
}
