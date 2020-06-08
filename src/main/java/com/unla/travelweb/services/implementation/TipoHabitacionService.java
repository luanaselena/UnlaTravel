package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.TipoHabitacionConverter;
import com.unla.travelweb.entities.TipoHabitacion;
import com.unla.travelweb.models.TipoHabitacionModel;
import com.unla.travelweb.repositories.ITipoHabitacionRepository;
import com.unla.travelweb.services.ITipoHabitacionService;

@Service("tipoHabitacionService")
public class TipoHabitacionService implements ITipoHabitacionService{

	@Autowired
	@Qualifier("tipoHabitacionConverter")
	private TipoHabitacionConverter tipoHabitacionConverter;
	
	@Autowired
	@Qualifier("tipoHabitacionRepository")
	private ITipoHabitacionRepository tipoHabitacionRepository;
	
	
	@Override
	public List<TipoHabitacion> getAll() {
		return tipoHabitacionRepository.findAll();
	}

	@Override
	public TipoHabitacionModel findById(long idHabitacion) {
		return tipoHabitacionConverter.entityToModel(tipoHabitacionRepository.findById(idHabitacion));
	}

	@Override
	public TipoHabitacionModel findByTipo(String tipo) {
		return tipoHabitacionConverter.entityToModel(tipoHabitacionRepository.findByTipo(tipo));
	}

	@Override
	public TipoHabitacionModel insert(TipoHabitacionModel habitacion) {
		TipoHabitacion h = tipoHabitacionRepository.save(tipoHabitacionConverter.modelToEntity(habitacion));
        return tipoHabitacionConverter.entityToModel(h);
	}

	@Override
	public TipoHabitacionModel update(TipoHabitacionModel habitacion) {
		TipoHabitacion h = tipoHabitacionRepository.save(tipoHabitacionConverter.modelToEntity(habitacion));
        return tipoHabitacionConverter.entityToModel(h);
	}

	@Override
	public boolean remove(long id) {
		try{
			tipoHabitacionRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
	}

}
