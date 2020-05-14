package com.unla.travelweb.entities;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name="actividad")
public class Actividad {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	@Column(name="fecha", nullable=true)
	private LocalDate fecha;

	@Column (name= "valoracion", nullable=false)
	private int valoracion;
	
    @Column(name="accesibilidad", nullable=false)
    private boolean accesibilidad;
    
    @ManyToOne
    @JoinColumn(name="destino_id", nullable=false)
    private Destino destino;

    public Actividad() {}
    
    public Actividad(String nombre, LocalDate fecha, int valoracion, boolean accesibilidad, Destino destino) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.valoracion = valoracion;
		this.accesibilidad = accesibilidad;
		this.destino = destino;
	}
    
	public Actividad(long id, String nombre, LocalDate fecha, int valoracion, boolean accesibilidad, Destino destino) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.valoracion = valoracion;
		this.accesibilidad = accesibilidad;
		this.destino = destino;
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public boolean isAccesibilidad() {
		return accesibilidad;
	}

	public void setAccesibilidad(boolean accesibilidad) {
		this.accesibilidad = accesibilidad;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	
	
}
