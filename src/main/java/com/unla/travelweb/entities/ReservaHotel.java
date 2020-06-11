package com.unla.travelweb.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.Nullable;

@Entity
@Table(name="reserva_hotel")
public class ReservaHotel{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
	
	@Column(name="nombre", nullable=true, length=30)
	private String nombre;

	@Column (name= "cantEstrellas", nullable=true)
	private int cantEstrellas;
	
	@OneToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST}, optional=true)
    @JoinColumn(name="tipo_alojamiento_id_tipo_alojamiento", referencedColumnName = "id", nullable=true)
    private TipoAlojamiento tipoAlojamiento;
	
	@ManyToMany(mappedBy = "listaHoteles")
	private List<TipoServicio> tipoServicio = new ArrayList<TipoServicio>();
    
	@OneToOne
    @JoinColumn(name="tipo_habitacion_id_tipo_habitacion", referencedColumnName = "id", nullable=true)
    private TipoHabitacion tipoHabitacion;
    
	@OneToOne
    @JoinColumn(name="tipo_regimen_id_tipo_regimen", referencedColumnName = "id", nullable=true)
    private TipoRegimen tipoRegimen;
    
    @Column(name= "accesibilidad", nullable=true)
    private boolean accesibilidad;
    
    @Column(name= "cantPersonas", nullable=true)
    private int cantPersonas;
    
    @Column(name= "precio", nullable=false)
    private double precio;
    
    @Column(name = "imgPath", nullable=true)
    private String imgPath;
    
    public ReservaHotel() {}

	public ReservaHotel(long id, String nombre, int cantEstrellas, TipoAlojamiento tipoAlojamiento, TipoHabitacion tipoHabitacion, TipoRegimen tipoRegimen,
			boolean accesibilidad, int cantPersonas, double precio, String imgPath) {
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
	}
	
	public ReservaHotel(String nombre, int cantEstrellas, TipoAlojamiento tipoAlojamiento, TipoHabitacion tipoHabitacion, TipoRegimen tipoRegimen,
			boolean accesibilidad, int cantPersonas, double precio, String imgPath) {
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

	public TipoAlojamiento getTipoAlojamiento() {
		return tipoAlojamiento;
	}

	public void setTipoAlojamiento(TipoAlojamiento tipoAlojamiento) {
		this.tipoAlojamiento = tipoAlojamiento;
	}

	public List<TipoServicio> getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(List<TipoServicio> tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(@Nullable TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public TipoRegimen getTipoRegimen() {
		return tipoRegimen;
	}

	public void setTipoRegimen(@Nullable TipoRegimen tipoRegimen) {
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
    
    
	
}
