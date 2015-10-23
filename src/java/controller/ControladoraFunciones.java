package controller;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import model.dao.DAOGenerico;
import model.Funcion;
import model.Pelicula;
import model.Sala;
import model.dao.DAOFunciones;

public class ControladoraFunciones {

    static ControladoraFunciones instance;

    public static ControladoraFunciones getInstance() {
        if (instance == null) {
            instance = new ControladoraFunciones();
        }
        return instance;
    }

    DAOGenerico dao = DAOGenerico.getInstance();
    
    public void agregar(Pelicula pelicula, Sala sala, Date fecha, Time hora) {
        Funcion funcion = new Funcion(pelicula, sala, fecha, hora, null);
        dao.agregar(funcion);
    }
    
    public Funcion buscarPorId(int id) {
        return (Funcion) dao.buscarPorId(Funcion.class, id);
    }
    
    public List<Funcion> getLista() {
        return dao.getLista(Funcion.class);
    }
    
    public List<Funcion> listarPorSala(int id) {
        DAOFunciones daoFunciones = DAOFunciones.getInstance();
        List<Funcion> funciones = daoFunciones.buscarPorSala(id);
        return funciones;
    }
}
