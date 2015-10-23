package model.dao;

import java.util.List;
import model.Funcion;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

public class DAOFunciones extends DAOGenerico {

    static DAOFunciones instance;

    public static DAOFunciones getInstance() {
        if (instance == null) {
            instance = new DAOFunciones();
        }
        return instance;
    }
    
    public List<Funcion> buscarPorSala(int id) {
        try {
            session = sessionFactory.openSession();
            list = session.createCriteria(Funcion.class).add(Restrictions.eq("sala", id)).list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            return list;
        }
    }

}
