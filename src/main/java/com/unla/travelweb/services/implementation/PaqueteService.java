package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.PaqueteConverter;
import com.unla.travelweb.entities.Paquete;
import com.unla.travelweb.models.PaqueteModel;
import com.unla.travelweb.repositories.IPaqueteRepository;
import com.unla.travelweb.services.IPaqueteService;

@Service("paqueteService")
public class PaqueteService implements IPaqueteService{
	
	@Autowired
	@Qualifier("paqueteRepository")
	private IPaqueteRepository paqueteRepository;
	
	@Autowired
	@Qualifier("paqueteConverter")
	private PaqueteConverter paqueteConverter;

	@Override
	public List<Paquete> getAll() {
		return paqueteRepository.findAll();
	}

	@Override
	public PaqueteModel findById(long id) {
		return paqueteConverter.entityToModel(paqueteRepository.findById(id));
	}

	@Override
	public PaqueteModel insert(PaqueteModel paqueteModel) {
		Paquete paquete = paqueteRepository.save(paqueteConverter.modelToEntity(paqueteModel));
        return paqueteConverter.entityToModel(paquete);
	}

	@Override
	public PaqueteModel update(PaqueteModel paqueteModel) {
		Paquete paquete = paqueteRepository.save(paqueteConverter.modelToEntity(paqueteModel));
        return paqueteConverter.entityToModel(paquete);
	}

	@Override
	public boolean remove(long id) {
		 try{
	            paqueteRepository.deleteById(id);
	            return true;
	        }
	        catch(Exception e){
	            return false;
	        }
	}

}
