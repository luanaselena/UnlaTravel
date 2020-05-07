package com.unla.travelweb.repositories;

import com.unla.travelweb.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("usuarioRepository")
public interface IUsuarioRepository extends JpaRepository<Usuario, Serializable> {

    public abstract Usuario findById(long id);
    public abstract Usuario findByDni(long dni);
}
