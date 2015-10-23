package model;
// Generated 17/10/2015 08:46:42 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Cine generated by hbm2java
 */
public class Cine implements java.io.Serializable {

    private Integer id;
    private String nombre;
    private String direccion;
    
    private Set salas = new HashSet(0);

    public Cine() {
    }

    public Cine(String nombre, String direccion, Set salas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = salas;
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

    public void setNombre(String nombreCine) {
        this.nombre = nombreCine;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set getSalas() {
        return this.salas;
    }

    public void setSalas(Set salas) {
        this.salas = salas;
    }
    
}
