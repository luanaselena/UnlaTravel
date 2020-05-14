package com.unla.travelweb.services.implementation;

import com.unla.travelweb.converters.DestinoConverter;
import com.unla.travelweb.entities.Destino;
import com.unla.travelweb.models.DestinoModel;
import com.unla.travelweb.repositories.IDestinoRepository;
import com.unla.travelweb.services.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("destinoService")
public class DestinoService implements IDestinoService {
	
	@Autowired
	@Qualifier("destinoRepository")
    private IDestinoRepository destinoRepository;
	
	@Autowired
    @Qualifier("destinoConverter")
    private DestinoConverter destinoConverter;

    @Override
    public List<Destino> getAll(){
        return destinoRepository.findAll();
    }

    @Override
    public DestinoModel insert(DestinoModel destinoModel) {

    	Destino destino = destinoRepository.save(destinoConverter.modelToEntity(destinoModel));
        return destinoConverter.entityToModel(destino);

    }

    @Override
    public DestinoModel update(DestinoModel destinoModel) {

    	Destino destino = destinoRepository.save(destinoConverter.modelToEntity(destinoModel));
        return destinoConverter.entityToModel(destino);
    }

    @Override
    public boolean remove(long id){
        try{
            destinoRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public DestinoModel findById(long id) {
        return destinoConverter.entityToModel(destinoRepository.findById(id));
    }
}
