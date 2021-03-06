package com.unla.travelweb.models;

import java.util.Date;

import com.unla.travelweb.entities.Carrito;

public class UsuarioModel {

    private long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String domicilio;
    private String mail;
    private String nacionalidad;
    private long dni;
    private ReservaVueloModel reservaVuelo;

    public UsuarioModel(){}

    public UsuarioModel(long id, String nombre, String apellido, String telefono, String domicilio, String nacionalidad, String mail, long dni,
    		ReservaVueloModel reservaVuelo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.mail = mail;
        this.nacionalidad = nacionalidad;
        this.dni = dni;
        this.reservaVuelo = reservaVuelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

	public ReservaVueloModel getReservaVuelo() {
		return reservaVuelo;
	}

	public void setReservaVuelo(ReservaVueloModel reservaVuelo) {
		this.reservaVuelo = reservaVuelo;
	}

}
