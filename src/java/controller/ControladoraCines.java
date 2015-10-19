package controller;

import java.util.List;
import model.Cine;
import model.dao.DAOGeneric;

public class ControladoraCines {

    static ControladoraCines instance;

    public static ControladoraCines getInstance() {
        if (instance == null) {
            instance = new ControladoraCines();
        }
        return instance;
    }

    DAOGeneric daoAbm = DAOGeneric.getInstance();

    public void agregar(String nombre, String direccion) {
        Cine cine = new Cine(nombre, direccion, null);
        daoAbm.agregar(cine);
    }

    public Cine buscarPorId(int id) {
        return (Cine) daoAbm.buscarPorId(Cine.class, id);
    }

    public List<Cine> getLista() {
        return daoAbm.getLista(Cine.class, null);
    }

}
