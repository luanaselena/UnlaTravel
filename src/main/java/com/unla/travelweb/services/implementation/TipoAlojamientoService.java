package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.unla.travelweb.converters.TipoAlojamientoConverter;
import com.unla.travelweb.entities.TipoAlojamiento;
import com.unla.travelweb.models.TipoAlojamientoModel;
import com.unla.travelweb.repositories.ITipoAlojamientoRepository;
import com.unla.travelweb.services.ITipoAlojamientoService;

public class TipoAlojamientoService implements ITipoAlojamientoService{

	@Autowired
	@Qualifier("tipoAlojamientoConverter")
	private TipoAlojamientoConverter tipoAlojamientoConverter;
	
	@Autowired
	@Qualifier("tipoAlojamientoRepository")
	private ITipoAlojamientoRepository tipoAlojamientoRepository;
	
	@Override
	public List<TipoAlojamiento> getAll() {
		return tipoAlojamientoRepository.findAll();
	}

	@Override
	public TipoAlojamientoModel findById(long idAlojamiento) {
		return tipoAlojamientoConverter.entityToModel(tipoAlojamientoRepository.findById(idAlojamiento));
	}

	@Override
	public TipoAlojamientoModel findByTipo(String tipo) {
		return tipoAlojamientoConverter.entityToModel(tipoAlojamientoRepository.findByTipo(tipo));
	}

	@Override
	public TipoAlojamientoModel insert(TipoAlojamientoModel alojamiento) {
		TipoAlojamiento a = tipoAlojamientoRepository.save(tipoAlojamientoConverter.modelToEntity(alojamiento));
        return tipoAlojamientoConverter.entityToModel(a);
	}

	@Override
	public TipoAlojamientoModel update(TipoAlojamientoModel alojamiento) {
		TipoAlojamiento a = tipoAlojamientoRepository.save(tipoAlojamientoConverter.modelToEntity(alojamiento));
        return tipoAlojamientoConverter.entityToModel(a);
	}

	@Override
	public boolean remove(long id) {
		try{
			tipoAlojamientoRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
	}

}
