package com.unla.travelweb.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="origen_id", referencedColumnName = "id")
    private Destino origen;
	
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="destino_id", referencedColumnName = "id")
    private Destino destino;
	
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="aerolinea", referencedColumnName = "id")
	private Aerolinea aerolinea;
	
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="clase", referencedColumnName = "id")
	private Clase clase;
	
    @Column(name="escalaIncluida") 
	private boolean escalaIncluida;
    
    @Column(name= "precio", nullable=false)
    private double precio;
    
    public Vuelo(){}    
	public Vuelo(long id, Date fechaIda, Date fechaVuelta, Aerolinea aerolinea, Clase clase,
			boolean escalaIncluida, Destino origen, Destino destino, double precio) {
		super();
		this.id = id;
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
		this.aerolinea = aerolinea;
		this.clase = clase;
		this.escalaIncluida = escalaIncluida;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
	}

	public Vuelo(Date fechaIda, Date fechaVuelta, Aerolinea aerolinea, Clase clase, boolean escalaIncluida, Destino origen, Destino destino, double precio) {
		super();
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
		this.aerolinea = aerolinea;
		this.clase = clase;
		this.escalaIncluida = escalaIncluida;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
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

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}

	public boolean isEscalaIncluida() {
		return escalaIncluida;
	}

	public void setEscalaIncluida(boolean escalaIncluida) {
		this.escalaIncluida = escalaIncluida;
	}
	public Destino getOrigen() {
		return origen;
	}
	public void setOrigen(Destino origen) {
		this.origen = origen;
	}
	public Destino getDestino() {
		return destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
