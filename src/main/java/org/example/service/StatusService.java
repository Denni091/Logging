package org.example.service;

import org.apache.log4j.Logger;
import org.example.dao.StatusDao;
import org.example.entity.Statuses;

public class StatusService {

    private final StatusDao statusDao = new StatusDao();
    private final Logger logger = Logger.getLogger(StatusDao.class);

    public void save(Statuses statuses) {
        logger.debug(statuses);
        statusDao.save(statuses);
    }

    public void update(Statuses statuses) {
        logger.debug(statuses);
        statusDao.update(statuses);
    }

    public void delete(Statuses statuses) {
        logger.debug(statuses);
        statusDao.delete(statuses);
    }

    public Statuses getById(int id) {
        logger.debug(id);
        return statusDao.getById(id);
    }
}
