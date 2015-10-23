package model.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class DAOGenerico<T> {

    static DAOGenerico instance;

    public static DAOGenerico getInstance() {
        if (instance == null) {
            instance = new DAOGenerico();
        }
        return instance;
    }

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session;
    Query query;
    List<T> list;

    public void agregar(T o) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public void modificar(T o) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(o);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public void eliminar(T o) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(o);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public T buscarPorId(Class entidad, int id) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            return (T) session.get(entidad, id);
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    public T buscar(Class entidad, String campo, Object arg) {
        try {
            session = sessionFactory.openSession();
            Criteria criteria = session.createCriteria(entidad);
            criteria.add(Restrictions.eq(campo, arg));
            list = criteria.list();
            return list.get(0);
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    public List<T> getLista(Class entidad) {
        try {
            session = sessionFactory.openSession();
            list = session.createCriteria(entidad).list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            return list;
        }
    }
    
    public List<T> getListaPorCriterio(Class entidad, String campo, Object arg) {
        try {
            session = sessionFactory.openSession();
            Criteria criteria = session.createCriteria(entidad);
            criteria.add(Restrictions.eq(campo, arg));
            list = criteria.list();
            return list;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }
    
}
