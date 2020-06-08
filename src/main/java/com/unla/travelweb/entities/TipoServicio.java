package com.unla.travelweb.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_servicio")
public class TipoServicio {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
    @Column(name="tipo")
	private String tipo;
	
    @Column(name="porcentaje_aumento")
	private double porcentajeAumento;
    
	@ManyToMany(cascade = { CascadeType.ALL})
	@JoinTable(
			
			name = "servicioxhotel",
			joinColumns = { @JoinColumn(name = "id_servicio")},
			inverseJoinColumns = { @JoinColumn(name = "id_hotel")}
			
	)
    private Set<Hotel> listaHoteles = new HashSet<Hotel>();

	public TipoServicio(long id, String tipo, double porcentajeAumento) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.porcentajeAumento = porcentajeAumento;
	}

	public TipoServicio(String tipo, double porcentajeAumento) {
		super();
		this.tipo = tipo;
		this.porcentajeAumento = porcentajeAumento;
	}

	public TipoServicio() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPorcentajeAumento() {
		return porcentajeAumento;
	}

	public void setPorcentajeAumento(double porcentajeAumento) {
		this.porcentajeAumento = porcentajeAumento;
	}

	public Set<Hotel> getListaHoteles() {
		return listaHoteles;
	}

	public void setListaHoteles(Set<Hotel> listaHoteles) {
		this.listaHoteles = listaHoteles;
	}
    
	
    
}
