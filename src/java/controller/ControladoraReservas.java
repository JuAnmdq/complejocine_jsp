package controller;

import java.util.List;
import model.Funcion;
import model.Reserva;
import model.Usuario;
import model.dao.DAOGenerico;

public class ControladoraReservas {
    
    static ControladoraReservas instance;

    public static ControladoraReservas getInstance() {
        if (instance == null) {
            instance = new ControladoraReservas();
        }
        return instance;
    }

    DAOGenerico dao = DAOGenerico.getInstance();
    
    public void reservar(Funcion funcion, Usuario user) {
        Reserva reserva = new Reserva(funcion, user);
        dao.agregar(reserva);
    }
    
    public Reserva buscarPorId(int id) {
        Reserva reserva = (Reserva) dao.buscarPorId(Reserva.class, id);
        return reserva;
//return (Reserva) dao.buscarPorId(Reserva.class, id);
    }
    
    public List<Reserva> getLista() {
        return dao.getLista(Reserva.class);        
    }
    
    public List<Reserva> getReservasPorUsuario(int id) {
        Usuario user = (Usuario) dao.buscarPorId(Usuario.class, id);
        return dao.getListaPorCriterio(Reserva.class, "usuario", user);
    }
    
}
