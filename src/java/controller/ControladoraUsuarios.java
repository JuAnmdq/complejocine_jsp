package controller;

import java.util.List;
import model.Usuario;
import model.dao.DAOGenerico;

public class ControladoraUsuarios {
    
    static ControladoraUsuarios instance;

    public static ControladoraUsuarios getInstance() {
        if (instance == null) {
            instance = new ControladoraUsuarios();
        }
        return instance;
    }
    
    DAOGenerico dao = DAOGenerico.getInstance();
    
    public void modificar(int id, String email, String telefono, int rol) {
        Usuario user = (Usuario) dao.buscarPorId(Usuario.class, id);
        user.setEmail(email);
        user.setTelefono(telefono);
        user.setRol(rol);
        dao.modificar(user);
    }
    
    public Usuario buscarPorId(int id) {
        return (Usuario) dao.buscarPorId(Usuario.class, id);
    }
    
    public List<Usuario> getLista() {
        return dao.getLista(Usuario.class);
    }
    
}
