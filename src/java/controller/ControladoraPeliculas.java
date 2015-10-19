package controller;

import java.util.List;
import model.Pelicula;
import model.dao.DAOPeliculas;

public class ControladoraPeliculas {

    static ControladoraPeliculas instance;

    public static ControladoraPeliculas getInstance() {
        if (instance == null) {
            instance = new ControladoraPeliculas();
        }
        return instance;
    }

    DAOPeliculas daoPeliculas = DAOPeliculas.getInstance();
    
    public void agregar(String titulo, String director, Double duracion, String genero, String imagen) {
        Pelicula p = new Pelicula(titulo, director, duracion, genero, imagen, null);
        daoPeliculas.agregar(p);
    }
    
    public List<Pelicula> getLista() {
        return daoPeliculas.getLista(Pelicula.class, null);
    }
}
