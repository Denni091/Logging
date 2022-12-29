package org.example.service;

import org.example.dao.StatusDao;
import org.example.entity.Statuses;

public class StatusService {

    private StatusDao statusDao = new StatusDao();

    public void save(Statuses status) {
        System.out.println("Status for save: " + status.toString());
        statusDao.save(status);
    }

    public void update(Statuses statuses) {
        System.out.println("Status for update: " + statuses.toString());
        statusDao.update(statuses);
    }

    public void delete(Statuses statuses) {
        System.out.println("Status for deleting: " + statuses.toString());
        statusDao.delete(statuses);
    }

    public Statuses getById(int id) {
        System.out.println("Id for getting status: " + id);
        return statusDao.getById(id);
    }
}
