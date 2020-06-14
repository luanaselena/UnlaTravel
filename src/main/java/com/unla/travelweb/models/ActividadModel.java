package com.unla.travelweb.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.unla.travelweb.entities.Hotel;
import com.unla.travelweb.entities.Paquete;

public class ActividadModel {
	
    private long id;

    private String nombre;
    
	private Date fecha;

	private double valoracion;

    private boolean accesibilidad;

    private DestinoModel destino;

    private double precio;
    
    private String imgPath;
    
    private Set<PaqueteModel> listaHoteles = new HashSet<PaqueteModel>();

    
    public ActividadModel() {}
    
    public ActividadModel(String nombre, Date fecha, double valoracion, boolean accesibilidad, DestinoModel destino, double precio, String imgPath) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.valoracion = valoracion;
		this.accesibilidad = accesibilidad;
		this.destino = destino;
		this.precio = precio;
		this.imgPath = imgPath;
	}
    
	public ActividadModel(long id, String nombre, Date fecha, double valoracion, boolean accesibilidad, DestinoModel destino, double precio, String imgPath) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.fecha = fecha;
		this.valoracion = valoracion;
		this.accesibilidad = accesibilidad;
		this.destino = destino;
		this.precio = precio;
		this.imgPath = imgPath;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	public boolean isAccesibilidad() {
		return accesibilidad;
	}

	public void setAccesibilidad(boolean accesibilidad) {
		this.accesibilidad = accesibilidad;
	}

	public DestinoModel getDestino() {
		return destino;
	}

	public void setDestino(DestinoModel destino) {
		this.destino = destino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Set<PaqueteModel> getListaHoteles() {
		return listaHoteles;
	}

	public void setListaHoteles(Set<PaqueteModel> listaHoteles) {
		this.listaHoteles = listaHoteles;
	}
	
	

}
