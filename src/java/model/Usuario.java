package model;
// Generated 17/10/2015 08:46:42 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private String pass;
    private String email;
    private String telefono;
    private Integer rol;
    private Set reservas = new HashSet(0);

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, String pass, String email, String telefono, Integer rol, Set reservas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pass = pass;
        this.email = email;
        this.telefono = telefono;
        this.rol = rol;
        this.reservas = reservas;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getRol() {
        return this.rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public Set getReservas() {
        return this.reservas;
    }

    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }

}
