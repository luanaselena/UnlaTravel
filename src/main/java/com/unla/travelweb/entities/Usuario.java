package com.unla.travelweb.entities;
import javax.persistence.*;

@Entity
@Table(name="usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

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

    //@OneToOne(cascade = CascadeType.MERGE)
    //private Carrito carrito;

    @Column(name="dni")
    private long dni;

    public Usuario(){}

    public Usuario(long id, String nombre, String apellido, String telefono, String domicilio, String nacionalidad, String mail,
                    long dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.nacionalidad = nacionalidad;
        this.mail = mail;
        //this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }

    public Usuario(String nombre, String apellido, String telefono, String domicilio, String nacionalidad, String mail,
                   long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.nacionalidad = nacionalidad;
        this.mail = mail;
        //this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
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

    /*public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }*/

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
}
