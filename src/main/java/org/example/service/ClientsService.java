package org.example.service;

import org.example.dao.ClientsDao;
import org.example.entity.Clients;

public class ClientsService {
    private ClientsDao clientsDao = new ClientsDao();

    public void save(Clients clients) {
        System.out.println("Clients for save: " + clients.toString());
        clientsDao.save(clients);
    }

    public void update(Clients clients) {
        System.out.println("Clients for update: " + clients.toString());
        clientsDao.update(clients);
    }

    public void delete(Clients clients) {
        System.out.println("Clients for deleting: " + clients.toString());
        clientsDao.delete(clients);
    }

    public Clients getById(int id) {
        System.out.println("Id for getting client: " + id);
        return clientsDao.getById(id);
    }

    public Clients getByPhone(int phone) {

        System.out.println("Phone for getting clients: " + phone);
        return clientsDao.getByPhone(phone);
    }
}
