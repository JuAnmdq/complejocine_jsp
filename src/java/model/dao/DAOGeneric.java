package model.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class DAOGeneric<T> {

    static DAOGeneric instance;

    public static DAOGeneric getInstance() {
        if (instance == null) {
            instance = new DAOGeneric();
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

    public T buscarPorId(Class entidad, int arg) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            return (T) session.get(entidad, arg);
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

    public List<T> getLista(Class entidad, String composicion) {
        try {
            session = sessionFactory.openSession();
            list = session.createCriteria(entidad).setFetchMode(composicion, FetchMode.JOIN).list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            return list;
        }
    }

}
