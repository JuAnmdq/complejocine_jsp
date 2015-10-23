package model.dao;

import model.Usuario;
import org.hibernate.HibernateException;

public class DAOUsuarios extends DAOGenerico {

    static DAOUsuarios instance;

    public static DAOUsuarios getInstance() {
        if (instance == null) {
            instance = new DAOUsuarios();
        }
        return instance;
    }
    
    public Usuario buscarPorDni(String dni) {
        try {
            Usuario user = null;
            session = sessionFactory.openSession();
            session.beginTransaction();
            user = (Usuario) session.createQuery("from model.Usuario where dni = :dni")
                    .setString("dni", dni).uniqueResult();
            return user;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }
    
}
