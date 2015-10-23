package controller;

import java.util.List;
import model.Usuario;
import model.dao.DAOGenerico;

public class ControladoraRegistro {

    static ControladoraRegistro instance;

    public static ControladoraRegistro getInstance() {
        if (instance == null) {
            instance = new ControladoraRegistro();
        }
        return instance;
    }

    DAOGenerico daoAbm = DAOGenerico.getInstance();

    List<Usuario> usuarios;
    
    public void altaUsuario(String nombre, String apellido, String dni, String pass, String email, String telefono, int rol) {
        Usuario user = new Usuario(nombre, apellido, dni, pass, email, telefono, rol, null);
        daoAbm.agregar(user);
    }

    public Usuario buscarUsuario(String dni) {
        return (Usuario) daoAbm.buscar(Usuario.class, "dni", dni);
    }

    public List<Usuario> getUsuarios() {
        return daoAbm.getLista(Usuario.class);
    }
}
