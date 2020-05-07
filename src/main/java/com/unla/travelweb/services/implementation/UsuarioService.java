package com.unla.travelweb.services.implementation;

import com.unla.travelweb.converters.UsuarioConverter;
import com.unla.travelweb.entities.Usuario;
import com.unla.travelweb.models.UsuarioModel;
import com.unla.travelweb.repositories.IUsuarioRepository;
import com.unla.travelweb.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usuarioService")
public class UsuarioService implements IUsuarioService {

    @Autowired
    @Qualifier("usuarioRepository")
    private IUsuarioRepository usuarioRepository;

    @Autowired
    @Qualifier("usuarioConverter")
    private UsuarioConverter usuarioConverter;

    @Override
    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

    @Override
    public UsuarioModel findByDni(long dni) {

        return usuarioConverter.entityToModel(usuarioRepository.findByDni(dni));
    }

    @Override
    public UsuarioModel insert(UsuarioModel usuarioModel) {

        Usuario usuario = usuarioRepository.save(usuarioConverter.modelToEntity(usuarioModel));
        return usuarioConverter.entityToModel(usuario);

    }

    @Override
    public UsuarioModel update(UsuarioModel usuarioModel) {

        Usuario usuario = usuarioRepository.save(usuarioConverter.modelToEntity(usuarioModel));
        return usuarioConverter.entityToModel(usuario);
    }

    @Override
    public boolean remove(long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public UsuarioModel findById(long id) {
        return usuarioConverter.entityToModel(usuarioRepository.findById(id));
    }
}
