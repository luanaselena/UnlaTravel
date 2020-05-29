package com.unla.travelweb.models;


public class HotelModel {

    private long id;
    
    private String nombre;

	private int cantEstrellas;
	
    private String tipoServicio;
    
    private String tipoHabitaciones;
    
    private String tipoRegimen;
    
    private boolean accesibilidad;
    
    private int cantPersonas;
    
    private double precio;
    
    public HotelModel() {}

	public HotelModel(long id, String nombre, int cantEstrellas, String tipoServicio, 
			String tipoHabitaciones, String tipoRegimen,
			boolean accesibilidad, int cantPersonas, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantEstrellas = cantEstrellas;
		this.tipoServicio = tipoServicio;
		this.tipoHabitaciones = tipoHabitaciones;
		this.tipoRegimen = tipoRegimen;
		this.accesibilidad = accesibilidad;
		this.cantPersonas = cantPersonas;
		this.precio = precio;
	}
	
	public HotelModel(String nombre, int cantEstrellas, String tipoServicio, 
			String tipoHabitaciones, String tipoRegimen,
			boolean accesibilidad, int cantPersonas, double precio) {
		super();
		this.nombre = nombre;
		this.cantEstrellas = cantEstrellas;
		this.tipoServicio = tipoServicio;
		this.tipoHabitaciones = tipoHabitaciones;
		this.tipoRegimen = tipoRegimen;
		this.accesibilidad = accesibilidad;
		this.cantPersonas = cantPersonas;
		this.precio = precio;
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

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getTipoHabitaciones() {
		return tipoHabitaciones;
	}

	public void setTipoHabitaciones(String tipoHabitaciones) {
		this.tipoHabitaciones = tipoHabitaciones;
	}

	public String getTipoRegimen() {
		return tipoRegimen;
	}

	public void setTipoRegimen(String tipoRegimen) {
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
    
}