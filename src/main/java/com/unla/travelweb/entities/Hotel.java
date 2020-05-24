package com.unla.travelweb.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="hotel")
public class Hotel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
	
	@Column(name="nombre", nullable=true, length=30)
	private String nombre;

	@Column (name= "cantEstrellas", nullable=true)
	private int cantEstrellas;
	
    @Column(name="tipoServicio", nullable=true, length=30)
    private String tipoServicio;
    
    @Column(name= "tipoHabitaciones", nullable= true, length=30)
    private String tipoHabitaciones;
    
    @Column(name="tipoRegimen", nullable=true, length=30)
    private String tipoRegimen;
    
    @Column(name= "accesibilidad", nullable=true)
    private boolean accesibilidad;
    
    @Column(name= "cantPersonas", nullable=true)
    private int cantPersonas;
    
    public Hotel() {}

	public Hotel(long id,String nombre, int cantEstrellas, String tipoServicio, String tipoHabitaciones, String tipoRegimen,
			boolean accesibilidad, int cantPersonas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantEstrellas = cantEstrellas;
		this.tipoServicio = tipoServicio;
		this.tipoHabitaciones = tipoHabitaciones;
		this.tipoRegimen = tipoRegimen;
		this.accesibilidad = accesibilidad;
		this.cantPersonas = cantPersonas;
	}
	
	public Hotel(String nombre, int cantEstrellas, String tipoServicio, String tipoHabitaciones, String tipoRegimen,
			boolean accesibilidad, int cantPersonas) {
		super();
		this.nombre = nombre;
		this.cantEstrellas = cantEstrellas;
		this.tipoServicio = tipoServicio;
		this.tipoHabitaciones = tipoHabitaciones;
		this.tipoRegimen = tipoRegimen;
		this.accesibilidad = accesibilidad;
		this.cantPersonas = cantPersonas;
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
	
	
    
    
}
