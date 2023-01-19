package org.example.dao;

import org.apache.log4j.Logger;
import org.example.entity.Accounts;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDao {

    private final Logger logger = Logger.getLogger(AccountDao.class);
    public void save(Accounts accounts) {
        logger.debug(accounts);

        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(accounts);

        transaction.commit();
        session.close();
    }

    public void update(Accounts accounts) {
        logger.debug(accounts);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(accounts);

        transaction.commit();
        session.close();
    }

    public void delete(Accounts accounts) {
        logger.debug(accounts);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(accounts);

        transaction.commit();
        session.close();
    }


    public Accounts getById(int id) {
        logger.debug(id);
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Accounts accounts = session.get(Accounts.class, id);

        transaction.commit();
        session.close();

        return accounts;
    }
}
