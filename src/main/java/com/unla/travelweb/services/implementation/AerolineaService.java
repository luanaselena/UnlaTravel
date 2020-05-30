package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.unla.travelweb.converters.AerolineaConverter;
import com.unla.travelweb.entities.Aerolinea;
import com.unla.travelweb.models.AerolineaModel;
import com.unla.travelweb.repositories.IAerolineaRepository;
import com.unla.travelweb.services.IAerolineaService;

public class AerolineaService implements IAerolineaService{

	@Autowired
	@Qualifier("aerolineaRepository")
	private IAerolineaRepository aerolineaRepository;
	
	@Autowired
	@Qualifier("aerolineaConverter")
	private AerolineaConverter aerolineaConverter;
	
	@Override
	public List<Aerolinea> getAll() {
		// TODO Auto-generated method stub
		return aerolineaRepository.findAll();
	}

	@Override
	public AerolineaModel findById(long idAerolinea) {
		// TODO Auto-generated method stub
		return aerolineaConverter.entityToModel(aerolineaRepository.findById(idAerolinea));
	}

	@Override
	public AerolineaModel insert(AerolineaModel aerolineaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AerolineaModel update(AerolineaModel aerolineaModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
