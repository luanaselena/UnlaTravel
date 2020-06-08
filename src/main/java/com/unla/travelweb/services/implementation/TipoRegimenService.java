package com.unla.travelweb.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.travelweb.converters.TipoRegimenConverter;
import com.unla.travelweb.entities.TipoRegimen;
import com.unla.travelweb.models.TipoRegimenModel;
import com.unla.travelweb.repositories.ITipoRegimenRepository;
import com.unla.travelweb.services.ITipoRegimenService;

@Service("tipoRegimenService")
public class TipoRegimenService implements ITipoRegimenService{

	@Autowired
	@Qualifier("tipoRegimenConverter")
	private TipoRegimenConverter tipoRegimenConverter;
	
	@Autowired
	@Qualifier("tipoRegimenRepository")
	private ITipoRegimenRepository tipoRegimenRepository;
	
	@Override
	public List<TipoRegimen> getAll() {
		return tipoRegimenRepository.findAll();
	}

	@Override
	public TipoRegimenModel findById(long idRegimen) {
		return tipoRegimenConverter.entityToModel(tipoRegimenRepository.findById(idRegimen));
	}

	@Override
	public TipoRegimenModel findByTipo(String tipo) {
		return tipoRegimenConverter.entityToModel(tipoRegimenRepository.findByTipo(tipo));
	}

	@Override
	public TipoRegimenModel insert(TipoRegimenModel regimen) {
		TipoRegimen r = tipoRegimenRepository.save(tipoRegimenConverter.modelToEntity(regimen));
        return tipoRegimenConverter.entityToModel(r);
	}

	@Override
	public TipoRegimenModel update(TipoRegimenModel regimen) {
		TipoRegimen r = tipoRegimenRepository.save(tipoRegimenConverter.modelToEntity(regimen));
        return tipoRegimenConverter.entityToModel(r);
	}

	@Override
	public boolean remove(long id) {
		try{
			tipoRegimenRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
	}

}
