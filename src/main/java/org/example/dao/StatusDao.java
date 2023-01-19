package org.example.dao;

import org.apache.log4j.Logger;
import org.example.entity.Clients;
import org.example.entity.Statuses;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDao {

    private final Logger logger = Logger.getLogger(StatusDao.class);

    public void save(Statuses statuses) {
        logger.debug(statuses);

        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(statuses);

        transaction.commit();
        session.close();
    }

    public void update(Statuses statuses) {
        logger.debug(statuses);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(statuses);

        transaction.commit();
        session.close();
    }

    public void delete(Statuses statuses) {
        logger.debug(statuses);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(statuses);

        transaction.commit();
        session.close();
    }


    public Statuses getById(int id) {
        logger.debug(id);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Statuses statuses = session.get(Statuses.class, id);

        transaction.commit();
        session.close();

        return statuses;
    }
}
