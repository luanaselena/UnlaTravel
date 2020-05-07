package com.unla.travelweb.services;

import com.unla.travelweb.entities.Usuario;
import com.unla.travelweb.models.UsuarioModel;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> getAll();
    public UsuarioModel findById(long id);
    public UsuarioModel findByDni(long dni);
    public UsuarioModel insert(UsuarioModel usuarioModel);
    public UsuarioModel update(UsuarioModel usuarioModel);
    public boolean remove(long id);
}
