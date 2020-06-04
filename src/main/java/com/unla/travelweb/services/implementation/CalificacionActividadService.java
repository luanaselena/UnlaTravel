package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.CalificacionActividadConverter;
import com.unla.travelweb.entities.CalificacionActividad;
import com.unla.travelweb.models.CalificacionActividadModel;
import com.unla.travelweb.repositories.ICalificacionActividadRepository;
import com.unla.travelweb.services.ICalificacionActividadService;

@Service("calificacionActividadService")
public class CalificacionActividadService implements ICalificacionActividadService{

	@Autowired
	@Qualifier("calificacionActividadRepository")
	private ICalificacionActividadRepository calificacionActividadRepository;
	
	@Autowired
	@Qualifier("calificacionActividadConverter")
	private CalificacionActividadConverter calificacionActividadConverter;
	
	@Override
	public List<CalificacionActividad> getAll() {
		return calificacionActividadRepository.findAll();
	}

	@Override
	public CalificacionActividadModel findById(long idCalificacion) {
		return calificacionActividadConverter.entityToModel(calificacionActividadRepository.findById(idCalificacion));
	}

	@Override
	public CalificacionActividadModel insert(CalificacionActividadModel calificacionActividad) {
		CalificacionActividad c = calificacionActividadRepository.save(calificacionActividadConverter.modelToEntity(calificacionActividad));
        return calificacionActividadConverter.entityToModel(c);
	}

	@Override
	public boolean remove(long id) {
		try{
			calificacionActividadRepository.deleteById(id);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}

}
