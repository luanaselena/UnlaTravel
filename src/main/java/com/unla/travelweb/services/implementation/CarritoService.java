package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.CarritoConverter;
import com.unla.travelweb.entities.Carrito;
import com.unla.travelweb.models.CarritoModel;
import com.unla.travelweb.repositories.ICarritoRepository;
import com.unla.travelweb.services.ICarritoService;

@Service("carritoService")
public class CarritoService implements ICarritoService{
	
	@Autowired
	@Qualifier("carritoRepository")
    private ICarritoRepository carritoRepository;
	
	@Autowired
    @Qualifier("carritoConverter")
    private CarritoConverter carritoConverter;
	
	@Override
    public List<Carrito> getAll(){
        return carritoRepository.findAll();
    }
	
	@Override
    public CarritoModel insert(CarritoModel carritoModel) {

    	Carrito carrito = carritoRepository.save(carritoConverter.modelToEntity(carritoModel));
        return carritoConverter.entityToModel(carrito);

    }
	
	@Override
    public CarritoModel update(CarritoModel carritoModel) {

    	Carrito carrito = carritoRepository.save(carritoConverter.modelToEntity(carritoModel));
        return carritoConverter.entityToModel(carrito);
    }
	
	 @Override
	    public boolean remove(long id){
	        try{
	            carritoRepository.deleteById(id);
	            return true;
	        }
	        catch(Exception e){
	            return false;
	        }
	    }
	 
	 @Override
	    public CarritoModel findById(long id) {
	        return carritoConverter.entityToModel(carritoRepository.findById(id));
	    }

}
