package controller;

import java.util.List;
import model.Funcion;
import model.dao.DAOGeneric;

public class ControladoraFunciones {

    static ControladoraFunciones instance;

    public static ControladoraFunciones getInstance() {
        if (instance == null) {
            instance = new ControladoraFunciones();
        }
        return instance;
    }

    DAOGeneric daoAbm = DAOGeneric.getInstance();
    
    public void agregar() {
        Funcion funcion = new Funcion(null, null, null, null, null);
        daoAbm.agregar(funcion);
    }
    
    public List<Funcion> getLista() {
        return daoAbm.getLista(Funcion.class, null);
    }
}
