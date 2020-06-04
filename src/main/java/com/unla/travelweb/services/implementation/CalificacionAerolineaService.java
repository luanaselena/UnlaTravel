package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.CalificacionAerolineaConverter;
import com.unla.travelweb.entities.CalificacionAerolinea;
import com.unla.travelweb.models.CalificacionAerolineaModel;
import com.unla.travelweb.repositories.ICalificacionAerolineaRepository;
import com.unla.travelweb.services.ICalificacionAerolineaService;

@Service("calificacionAerolineaService")
public class CalificacionAerolineaService implements ICalificacionAerolineaService{

	@Autowired
	@Qualifier("calificacionAerolineaRepository")
	private ICalificacionAerolineaRepository calificacionAerolineaRepository;
	
	@Autowired
	@Qualifier("calificacionAerolineaConverter")
	private CalificacionAerolineaConverter calificacionAerolineaConverter;
	
	@Override
	public List<CalificacionAerolinea> getAll() {
		return calificacionAerolineaRepository.findAll();
	}

	@Override
	public CalificacionAerolineaModel findById(long idCalificacion) {
		return calificacionAerolineaConverter.entityToModel(calificacionAerolineaRepository.findById(idCalificacion));
	}

	@Override
	public CalificacionAerolineaModel insert(CalificacionAerolineaModel calificacionAerolinea) {
		CalificacionAerolinea c = calificacionAerolineaRepository.save(calificacionAerolineaConverter.modelToEntity(calificacionAerolinea));
        return calificacionAerolineaConverter.entityToModel(c);
	}

	@Override
	public boolean remove(long id) {
		try{
			calificacionAerolineaRepository.deleteById(id);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}

}
