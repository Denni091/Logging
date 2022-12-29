package org.example.dao;

import org.example.entity.Clients;
import org.example.entity.Statuses;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDao {

    public void save(Statuses statuses) {

        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(statuses);

        transaction.commit();
        session.close();
    }

    public void update(Statuses statuses) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(statuses);

        transaction.commit();
        session.close();
    }

    public void delete(Statuses statuses) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(statuses);

        transaction.commit();
        session.close();
    }


    public Statuses getById(int id) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Statuses statuses = session.get(Statuses.class, id);

        transaction.commit();
        session.close();

        return statuses;
    }
}
