package com.unla.travelweb.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.Nullable;



@Entity
@Table(name="vuelo")
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
	@Nullable
    @Column(name="fechaIda")
	private Date fechaIda;

    @Nullable
    @Column(name="fechaVuelta", nullable=true) 
	private Date fechaVuelta;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.PERSIST}, optional=true)
    @JoinColumn(name="origen_id", referencedColumnName = "id")
    private Destino origen;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.PERSIST}, optional=true)
    @JoinColumn(name="destino_id", referencedColumnName = "id")
    private Destino destino;
    
    @Nullable
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.PERSIST}, optional=true)
    @JoinColumn(name="aerolinea_id", referencedColumnName = "id", nullable=true)
	private Aerolinea aerolinea;
	
    @Nullable
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.PERSIST}, optional=true)
    @JoinColumn(name="clase_id", referencedColumnName = "id", nullable=true)
	private Clase clase;
	
    @Nullable
    @Column(name="escalaIncluida") 
	private Boolean escalaIncluida;
    
    @Nullable
    @Column(name= "precio", nullable=true)
    private Double precio;
    
    @Nullable
    @Column(name="cantPersonas")
    private Integer cantPersonas;
    
    public Vuelo(){}    
	public Vuelo(long id, Date fechaIda, Date fechaVuelta, Aerolinea aerolinea, Clase clase,
			boolean escalaIncluida, Destino origen, Destino destino, double precio, int cantPersonas) {
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
		this.cantPersonas = cantPersonas;
	}

	public Vuelo(Date fechaIda, Date fechaVuelta, Aerolinea aerolinea, Clase clase, boolean escalaIncluida, Destino origen, Destino destino, double precio, int cantPersonas) {
		super();
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
		this.aerolinea = aerolinea;
		this.clase = clase;
		this.escalaIncluida = escalaIncluida;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
		this.cantPersonas = cantPersonas;
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
	public int getCantPersonas() {
		return cantPersonas;
	}
	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}
	
	
	
}
