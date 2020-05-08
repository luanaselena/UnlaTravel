package com.unla.travelweb.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vuelo")
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
    @Column(name="fechaIda")
	private Date fechaIda;
    
    @Column(name="fechaVuelta", nullable=true) 
	private Date fechaVuelta;
	
//  @Column(name="") 
//	private Destino origen;
	
//  @Column(name="") 
//	private Destino destino;
	
    @Column(name="valoracionAerolinea", nullable=true) 
	private double valoracionAerolinea;
	
    @Column(name="clase") 
	private int clase;
	
    @Column(name="escalaIncluida") 
	private boolean escalaIncluida;

    
    public Vuelo(){}    
	public Vuelo(long id, Date fechaIda, Date fechaVuelta, double valoracionAerolinea, int clase,
			boolean escalaIncluida) {
		super();
		this.id = id;
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
		this.valoracionAerolinea = valoracionAerolinea;
		this.clase = clase;
		this.escalaIncluida = escalaIncluida;
	}

	public Vuelo(Date fechaIda, Date fechaVuelta, double valoracionAerolinea, int clase, boolean escalaIncluida) {
		super();
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
		this.valoracionAerolinea = valoracionAerolinea;
		this.clase = clase;
		this.escalaIncluida = escalaIncluida;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaIda() {
		return fechaIda;
	}

	public void setFechaIda(Date fechaIda) {
		this.fechaIda = fechaIda;
	}

	public Date getFechaVuelta() {
		return fechaVuelta;
	}

	public void setFechaVuelta(Date fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
	}

	public double getValoracionAerolinea() {
		return valoracionAerolinea;
	}

	public void setValoracionAerolinea(double valoracionAerolinea) {
		this.valoracionAerolinea = valoracionAerolinea;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public boolean isEscalaIncluida() {
		return escalaIncluida;
	}

	public void setEscalaIncluida(boolean escalaIncluida) {
		this.escalaIncluida = escalaIncluida;
	}
	
	
}
