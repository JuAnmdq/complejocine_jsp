package controller;

import model.Usuario;
import model.dao.DAOUsuarios;

public class ControladoraLogin {

    static ControladoraLogin instance;

    public static ControladoraLogin getInstance() {

        if (instance == null) {
            instance = new ControladoraLogin();
        }

        return instance;
    }

    DAOUsuarios daoUsuarios = DAOUsuarios.getInstance();

    public Usuario login(String dni, String pass) {

        Usuario user = daoUsuarios.buscarPorDni(dni);

        return user;
    }

}
