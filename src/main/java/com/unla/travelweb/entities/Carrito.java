package com.unla.travelweb.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
	
	@OneToMany(fetch = FetchType.LAZY)
	private Set<Paquete> reservas = new HashSet<>();
	
	public Carrito() {}

	public Carrito(long id, Set<Paquete> reservas) {
		super();
		this.id = id;
		this.reservas = reservas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Paquete> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Paquete> reservas) {
		this.reservas = reservas;
	}		

}
