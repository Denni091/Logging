package org.example.service;

import org.apache.log4j.Logger;
import org.example.dao.ClientsDao;
import org.example.entity.Clients;

public class ClientsService {
    private final ClientsDao clientsDao = new ClientsDao();
    private final Logger logger = Logger.getLogger(ClientsService.class);

    public void save(Clients clients) {
        logger.debug(clients);
        clientsDao.save(clients);
    }

    public void update(Clients clients) {
        logger.debug(clients);
        clientsDao.update(clients);
    }

    public void delete(Clients clients) {
        logger.debug(clients);
        clientsDao.delete(clients);
    }

    public Clients getById(int id) {
        logger.debug(id);
        return clientsDao.getById(id);
    }

    public Clients getByPhone(int phone) {
        logger.debug(phone);
        return clientsDao.getByPhone(phone);
    }
}
