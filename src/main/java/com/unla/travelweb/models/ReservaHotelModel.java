package com.unla.travelweb.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.sun.istack.Nullable;

public class ReservaHotelModel {

    private long id;
    
    private String nombre;

	private int cantEstrellas;
	
	private TipoAlojamientoModel tipoAlojamiento;
	
	private List<TipoServicioModel> tipoServicio = new ArrayList<TipoServicioModel>();
    
	@Nullable
    private TipoHabitacionModel tipoHabitacion;
    
	@Nullable
    private TipoRegimenModel tipoRegimen;
    
    private boolean accesibilidad;
    
    private int cantPersonas;
    
    private double precio;
    
    private String imgPath;
    
    private Date fechaInicio;
    
    private Date fechaFin;
    
    public ReservaHotelModel () {}

	public ReservaHotelModel (long id, String nombre, int cantEstrellas, TipoAlojamientoModel tipoAlojamiento,
			 TipoHabitacionModel tipoHabitacion, TipoRegimenModel tipoRegimen,
			boolean accesibilidad, int cantPersonas, double precio, String imgPath, Date fechaInicio, Date fechaFin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantEstrellas = cantEstrellas;
		this.tipoAlojamiento = tipoAlojamiento;
		this.tipoHabitacion = tipoHabitacion;
		this.tipoRegimen = tipoRegimen;
		this.accesibilidad = accesibilidad;
		this.cantPersonas = cantPersonas;
		this.precio = precio;
		this.imgPath = imgPath;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public ReservaHotelModel (String nombre, int cantEstrellas, TipoAlojamientoModel tipoAlojamiento, 
			TipoHabitacionModel tipoHabitacion, TipoRegimenModel tipoRegimen,
			boolean accesibilidad, int cantPersonas, double precio, String imgPath, Date fechaInicio2, Date fechaFin2) {
		super();
		this.nombre = nombre;
		this.cantEstrellas = cantEstrellas;
		this.tipoAlojamiento = tipoAlojamiento;
		this.tipoHabitacion = tipoHabitacion;
		this.tipoRegimen = tipoRegimen;
		this.accesibilidad = accesibilidad;
		this.cantPersonas = cantPersonas;
		this.precio = precio;
		this.imgPath = imgPath;
		this.fechaInicio = fechaInicio2;
		this.fechaFin = fechaFin2;
	}

	public long getId() {
		return id;
	}

	public void setId(long idHotel) {
		this.id = idHotel;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantEstrellas() {
		return cantEstrellas;
	}

	public void setCantEstrellas(int cantEstrellas) {
		this.cantEstrellas = cantEstrellas;
	}

	public TipoAlojamientoModel getTipoAlojamiento() {
		return tipoAlojamiento;
	}

	public void setTipoAlojamiento(TipoAlojamientoModel tipoAlojamiento) {
		this.tipoAlojamiento = tipoAlojamiento;
	}

	public List<TipoServicioModel> getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(List<TipoServicioModel> tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public TipoHabitacionModel getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(@Nullable TipoHabitacionModel tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public TipoRegimenModel getTipoRegimen() {
		return tipoRegimen;
	}

	public void setTipoRegimen(@Nullable TipoRegimenModel tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}

	public boolean isAccesibilidad() {
		return accesibilidad;
	}

	public void setAccesibilidad(boolean accesibilidad) {
		this.accesibilidad = accesibilidad;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
    
}