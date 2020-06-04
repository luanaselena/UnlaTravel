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
@Table(name="calificacionActividad")
public class CalificacionActividad {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
	@Column(name="valoracion")
	private double valoracion;
	
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="actividad_id", referencedColumnName = "id")
	private Actividad actividad;
	
	public CalificacionActividad() {}
	
	public CalificacionActividad(long id, double valoracion, Actividad actividad) {
		this.id = id;
		this.valoracion = valoracion;
		this.actividad = actividad;
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

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	
	
}
