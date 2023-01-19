package org.example.dao;

import org.apache.log4j.Logger;
import org.example.entity.Clients;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;

public class ClientsDao {

    private final Logger logger = Logger.getLogger(ClientsDao.class);

    public void save(Clients clients) {
        logger.debug(clients);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(clients);

        transaction.commit();
        session.close();
    }

    public void update(Clients clients) {
        logger.debug(clients);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(clients);

        transaction.commit();
        session.close();
    }

    public void delete(Clients clients) {
        logger.debug(clients);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(clients);

        transaction.commit();
        session.close();
    }


    public Clients getById(int id) {
        logger.debug(id);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Clients clients = session.get(Clients.class, id);

        transaction.commit();
        session.close();

        return clients;
    }

    public Clients getByPhone(int phone) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNamedQuery("getByPhone");
        query.setParameter("phone", phone);
        Clients clients = (Clients) query.getSingleResult();

        transaction.commit();
        session.close();

//        logger.debug(phone);
        return clients;

    }
}
