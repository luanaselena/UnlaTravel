package com.unla.travelweb.models;

import java.sql.Date;

public class ReservaActividadModel {
	
    private long id;

    private String nombre;
    
	private Date fecha;

	private double valoracion;

    private boolean accesibilidad;

    private DestinoModel destino;

    private double precio;
    
    private String imgPath;
    
    public ReservaActividadModel() {}
    
    public ReservaActividadModel(String nombre, Date fecha, double valoracion, boolean accesibilidad, DestinoModel destino, double precio, String imgPath) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.valoracion = valoracion;
		this.accesibilidad = accesibilidad;
		this.destino = destino;
		this.precio = precio;
		this.imgPath = imgPath;
	}
    
	public ReservaActividadModel(long id, String nombre, Date fecha, double valoracion, boolean accesibilidad, DestinoModel destino, double precio, String imgPath) {
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
	
	

}
