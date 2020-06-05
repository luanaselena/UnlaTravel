package com.unla.travelweb.converters;

import com.unla.travelweb.entities.Usuario;
import com.unla.travelweb.models.UsuarioModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("usuarioConverter")
public class UsuarioConverter {
    public UsuarioModel entityToModel(Usuario usuario) {
        return new UsuarioModel(usuario.getId(), usuario.getNombre(), usuario.getApellido(), usuario.getTelefono(), usuario.getDomicilio(), usuario.getNacionalidad(), usuario.getMail(),
                usuario.getDni(), usuario.getCarrito());
    }

    public Usuario modelToEntity(UsuarioModel usuarioModel) {
        return new Usuario(usuarioModel.getId(), usuarioModel.getNombre(), usuarioModel.getApellido(), usuarioModel.getTelefono(), usuarioModel.getDomicilio(), usuarioModel.getNacionalidad(), usuarioModel.getMail(),
                usuarioModel.getDni(), usuarioModel.getCarrito());
    }
}
