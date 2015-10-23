package controller;

import java.util.List;
import model.Pelicula;
import model.dao.DAOGenerico;

public class ControladoraPeliculas {

    static ControladoraPeliculas instance;

    public static ControladoraPeliculas getInstance() {
        if (instance == null) {
            instance = new ControladoraPeliculas();
        }
        return instance;
    }

    DAOGenerico dao = DAOGenerico.getInstance();

    public void agregar(String titulo, String director, Double duracion, String genero, String imagen) {
        Pelicula p = new Pelicula(titulo, director, duracion, genero, imagen, null);
        dao.agregar(p);
    }

    public void modificar(int id, String titulo, String director, Double duracion, String genero, String imagen) {
        Pelicula p = (Pelicula) dao.buscarPorId(Pelicula.class, id);
        p.setTitulo(titulo);
        p.setDirector(director);
        p.setDuracion(duracion);
        p.setGenero(genero);
        p.setImagen(imagen);
        dao.modificar(p);
    }
    
    public void eliminar(int id) {
        Pelicula p = (Pelicula) dao.buscarPorId(Pelicula.class, id);
        dao.eliminar(p);
    }
    
    public Pelicula buscarPorId(int id) {
        return (Pelicula) dao.buscarPorId(Pelicula.class, id);
    }

    public List<Pelicula> getLista() {
        return dao.getLista(Pelicula.class);
    }
}
