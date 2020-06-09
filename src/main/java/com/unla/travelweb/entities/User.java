package com.unla.travelweb.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username", unique=true, nullable=false, length=45)
	private String username;
	
	@Column(name="password", nullable=false, length=60)
	private String password;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@Column(name="createdat")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	@Column(name="nombre", nullable=false, length=30)
    private String nombre;

    @Column(name="apellido", nullable=false, length=30)
    private String apellido;

    @Column(name="nacionalidad", nullable=false, length=30)
    private String nacionalidad;

    @Column(name="domicilio", nullable=false, length=50)
    private String domicilio;

    @Column(name="mail", nullable=false, length=30)
    private String mail;

    @Column(name="telefono", nullable=false, length=20)
    private String telefono;

    @Column(name="dni")
    private long dni;
    
	@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	private Set<UserRole> userRoles = new HashSet<UserRole>();
	
    @OneToOne(cascade = CascadeType.MERGE)
    private Carrito carrito;

	public User() {}
	
	public User(String username, String password, boolean enabled, String nombre, String apellido, String nacionalidad, String domicilio, String mail, String telefono, long dni) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.domicilio = domicilio;
		this.mail = mail;
		this.telefono = telefono;
		this.dni = dni;
	}
	
	public User(String username, String password, boolean enabled, Set<UserRole> userRoles,
			String nombre, String apellido, String nacionalidad, String domicilio, String mail, String telefono, long dni) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.userRoles = userRoles;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.domicilio = domicilio;
		this.mail = mail;
		this.telefono = telefono;
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	
	
	
	
}
