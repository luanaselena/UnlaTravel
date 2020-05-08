package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.VueloConverter;
import com.unla.travelweb.entities.Vuelo;
import com.unla.travelweb.models.VueloModel;
import com.unla.travelweb.repositories.IVueloRepository;
import com.unla.travelweb.services.IVueloService;

@Service("vueloService")
public class VueloService implements IVueloService{

	@Autowired
	@Qualifier("vueloRepository")
	private IVueloRepository vueloRepository;
	
	@Autowired
	@Qualifier("vueloConverter")
	private VueloConverter vueloConverter;
	
	@Override
	public List<Vuelo> getAll() {
		return vueloRepository.findAll();
	}

	@Override
	public VueloModel findById(long id) {
		return vueloConverter.entityToModel(vueloRepository.findById(id));
	}

	@Override
	public VueloModel insert(VueloModel vueloModel) {
		Vuelo vuelo = vueloRepository.save(vueloConverter.modelToEntity(vueloModel));
		return vueloConverter.entityToModel(vuelo);
	}

	@Override
	public VueloModel update(VueloModel vueloModel) {
		Vuelo vuelo = vueloRepository.save(vueloConverter.modelToEntity(vueloModel));
		return vueloConverter.entityToModel(vuelo);
	}

	@Override
	public boolean remove(long id) {
		try {
			vueloRepository.deleteById(id);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

}
