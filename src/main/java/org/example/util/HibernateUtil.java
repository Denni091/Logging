package org.example.util;

import org.apache.log4j.Logger;
import org.example.entity.Accounts;
import org.example.entity.Clients;
import org.example.entity.Statuses;
import org.example.service.AccountService;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static final Logger logger = Logger.getLogger(HibernateUtil.class);

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                if (configuration != null) {
                    configuration.addAnnotatedClass(Clients.class);
                    configuration.addAnnotatedClass(Statuses.class);
                    configuration.addAnnotatedClass(Accounts.class);
                    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                            .applySettings(configuration.getProperties());
                    sessionFactory = configuration.buildSessionFactory(builder.build());
                }
                logger.error(configuration);
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }
}
