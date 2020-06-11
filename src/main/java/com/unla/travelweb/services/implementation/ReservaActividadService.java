package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.ReservaActividadConverter;
import com.unla.travelweb.entities.ReservaActividad;
import com.unla.travelweb.models.ReservaActividadModel;
import com.unla.travelweb.repositories.IReservaActividadRepository;
import com.unla.travelweb.services.IReservaActividadService;

@Service("reservaActividadService")
public class ReservaActividadService implements IReservaActividadService {
	
	@Autowired
	@Qualifier("reservaActividadRepository")
    private IReservaActividadRepository reservaActividadRepository;
	
	@Autowired
    @Qualifier("reservaActividadConverter")
    private ReservaActividadConverter reservaActividadConverter;

    @Override
    public List<ReservaActividad> getAll(){
        return reservaActividadRepository.findAll();
    }

    @Override
    public ReservaActividadModel insert(ReservaActividadModel actividadModel) {

    	ReservaActividad actividad = reservaActividadRepository.save(reservaActividadConverter.modelToEntity(actividadModel));
        return reservaActividadConverter.entityToModel(actividad);

    }

    @Override
    public ReservaActividadModel update(ReservaActividadModel actividadModel) {

    	ReservaActividad actividad = reservaActividadRepository.save(reservaActividadConverter.modelToEntity(actividadModel));
        return reservaActividadConverter.entityToModel(actividad);
    }

    @Override
    public boolean remove(long id){
        try{
            reservaActividadRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public ReservaActividadModel findById(long id) {
        return reservaActividadConverter.entityToModel(reservaActividadRepository.findById(id));
    }

}
