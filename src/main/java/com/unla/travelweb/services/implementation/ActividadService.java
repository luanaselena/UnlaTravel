package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.ActividadConverter;
import com.unla.travelweb.entities.Actividad;
import com.unla.travelweb.models.ActividadModel;
import com.unla.travelweb.repositories.IActividadRepository;
import com.unla.travelweb.services.IActividadService;

@Service("actividadService")
public class ActividadService implements IActividadService {
	
	@Autowired
	@Qualifier("actividadRepository")
    private IActividadRepository actividadRepository;
	
	@Autowired
    @Qualifier("actividadConverter")
    private ActividadConverter actividadConverter;

    @Override
    public List<Actividad> getAll(){
        return actividadRepository.findAll();
    }

    @Override
    public ActividadModel insert(ActividadModel actividadModel) {

    	Actividad actividad = actividadRepository.save(actividadConverter.modelToEntity(actividadModel));
        return actividadConverter.entityToModel(actividad);

    }

    @Override
    public ActividadModel update(ActividadModel actividadModel) {

    	Actividad actividad = actividadRepository.save(actividadConverter.modelToEntity(actividadModel));
        return actividadConverter.entityToModel(actividad);
    }

    @Override
    public boolean remove(long id){
        try{
            actividadRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public ActividadModel findById(long id) {
        return actividadConverter.entityToModel(actividadRepository.findById(id));
    }

}
