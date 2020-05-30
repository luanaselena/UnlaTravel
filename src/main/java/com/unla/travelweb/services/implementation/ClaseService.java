package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.unla.travelweb.converters.ClaseConverter;
import com.unla.travelweb.entities.Clase;
import com.unla.travelweb.models.ClaseModel;
import com.unla.travelweb.repositories.IClaseRepository;
import com.unla.travelweb.services.IClaseService;

public class ClaseService implements IClaseService{

	@Autowired
	@Qualifier("claseRepository")
	private IClaseRepository claseRepository;
	
	@Autowired
	@Qualifier("claseConverter")
	private ClaseConverter claseConverter;
	
	@Override
	public List<Clase> getAll() {
		// TODO Auto-generated method stub
		return claseRepository.findAll();
	}

	@Override
	public ClaseModel findById(long idClase) {
		// TODO Auto-generated method stub
		return claseConverter.entityToModel(claseRepository.findById(idClase));
	}

	@Override
	public ClaseModel insert(ClaseModel claseModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaseModel update(ClaseModel claseModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
