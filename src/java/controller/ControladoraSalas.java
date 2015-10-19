package controller;

import java.util.List;
import java.util.Set;
import model.Cine;
import model.Sala;
import model.dao.DAOGeneric;

public class ControladoraSalas {

    static ControladoraSalas instance;

    public static ControladoraSalas getInstance() {
        if (instance == null) {
            instance = new ControladoraSalas();
        }
        return instance;
    }

    DAOGeneric daoAbm = DAOGeneric.getInstance();

    public void agregar(Cine cine, String nombre, int filas, int columnas) {
        Sala sala = new Sala(cine, nombre, filas, columnas, null);
        daoAbm.agregar(sala);
    }

    public Sala buscarPorId(int id) {
        return (Sala) daoAbm.buscarPorId(Sala.class, id);
    }

    public List<Sala> getLista() {
        return daoAbm.getLista(Sala.class, "cine");
    }

}
