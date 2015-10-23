package controller;

import java.util.List;
import model.dao.DAOGenerico;
import model.Cine;

public class ControladoraCines {

    static ControladoraCines instance;

    public static ControladoraCines getInstance() {
        if (instance == null) {
            instance = new ControladoraCines();
        }
        return instance;
    }

    DAOGenerico dao = DAOGenerico.getInstance();

    public void agregar(String nombre, String direccion) {
        Cine cine = new Cine(nombre, direccion, null);
        dao.agregar(cine);
    }
    
    public void modificar(int id, String nombre, String direccion) {
        Cine cine = (Cine) dao.buscarPorId(Cine.class, id);
        cine.setNombre(nombre);
        cine.setDireccion(direccion);
        dao.modificar(cine);
    }
    
    public void eliminar(int id) {
        Cine cine = (Cine) dao.buscarPorId(Cine.class, id);
        dao.eliminar(cine);
    }

    public Cine buscarPorId(int id) {
        return (Cine) dao.buscarPorId(Cine.class, id);
    }

    public List<Cine> getLista() {
        return dao.getLista(Cine.class);
    }

}
