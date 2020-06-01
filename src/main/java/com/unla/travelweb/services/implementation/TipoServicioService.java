package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.unla.travelweb.converters.TipoServicioConverter;
import com.unla.travelweb.entities.TipoServicio;
import com.unla.travelweb.models.TipoServicioModel;
import com.unla.travelweb.repositories.ITipoServicioRepository;
import com.unla.travelweb.services.ITipoServicioService;

public class TipoServicioService implements ITipoServicioService{

	@Autowired
	@Qualifier("tipoServicioConverter")
	private TipoServicioConverter tipoServicioConverter;
	
	@Autowired
	@Qualifier("tipoServicioRepository")
	private ITipoServicioRepository tipoServicioRepository;
	
	@Override
	public List<TipoServicio> getAll() {
		return tipoServicioRepository.findAll();
	}

	@Override
	public TipoServicioModel findById(long idServicio) {
		return tipoServicioConverter.entityToModel(tipoServicioRepository.findById(idServicio));
	}

	@Override
	public TipoServicioModel findByTipo(String tipo) {
		return tipoServicioConverter.entityToModel(tipoServicioRepository.findByTipo(tipo));
	}

	@Override
	public TipoServicioModel insert(TipoServicioModel servicio) {
		TipoServicio s = tipoServicioRepository.save(tipoServicioConverter.modelToEntity(servicio));
        return tipoServicioConverter.entityToModel(s);
	}

	@Override
	public TipoServicioModel update(TipoServicioModel servicio) {
		TipoServicio s = tipoServicioRepository.save(tipoServicioConverter.modelToEntity(servicio));
        return tipoServicioConverter.entityToModel(s);
	}

	@Override
	public boolean remove(long id) {
		try{
			tipoServicioRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
	}

}
