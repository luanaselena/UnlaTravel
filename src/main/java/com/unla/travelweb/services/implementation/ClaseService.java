package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.ClaseConverter;
import com.unla.travelweb.entities.Clase;
import com.unla.travelweb.entities.Destino;
import com.unla.travelweb.models.ClaseModel;
import com.unla.travelweb.repositories.IClaseRepository;
import com.unla.travelweb.services.IClaseService;

@Service("claseService")
public class ClaseService implements IClaseService{

	@Autowired
	@Qualifier("claseRepository")
	private IClaseRepository claseRepository;
	
	@Autowired
	@Qualifier("claseConverter")
	private ClaseConverter claseConverter;
	
	@Override
	public List<Clase> getAll() {
		return claseRepository.findAll();
	}

	@Override
	public ClaseModel findById(long idClase) {
		return claseConverter.entityToModel(claseRepository.findById(idClase));
	}

	@Override
	public ClaseModel insert(ClaseModel claseModel) {
		Clase clase= claseRepository.save(claseConverter.modelToEntity(claseModel));
        return claseConverter.entityToModel(clase);
	}

	@Override
	public ClaseModel update(ClaseModel claseModel) {
		Clase clase= claseRepository.save(claseConverter.modelToEntity(claseModel));
        return claseConverter.entityToModel(clase);
	}

	@Override
	public boolean remove(long id) {
		try{
			claseRepository.deleteById(id);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}

}
