package com.unla.travelweb.entities;

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
@Table(name="calificacionAerolinea")
public class CalificacionAerolinea {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
	@Column(name="valoracion")
	private double valoracion;
	
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="aerolinea_id", referencedColumnName = "id")
	private Aerolinea aerolinea;
	
	public CalificacionAerolinea() {
		
	}

	public CalificacionAerolinea(long id, double valoracion, Aerolinea aerolinea) {
		this.id = id;
		this.valoracion = valoracion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	
}
