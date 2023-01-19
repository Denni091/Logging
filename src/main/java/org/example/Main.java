package org.example;

import org.example.entity.Accounts;
import org.example.entity.Clients;
import org.example.entity.Statuses;
import org.example.service.AccountService;
import org.example.service.ClientsService;
import org.example.service.StatusService;

public class Main {

    public static void main(String[] args) {
        ClientsService clientsService = new ClientsService();
        Clients clients = new Clients();
        clients.setName("Miron");
        clients.setEmail("mironPPP@gmail.com");
        clients.setPhone(976254282);
        clients.setAbout("He is a politic");
        clientsService.save(clients);

        StatusService statusService = new StatusService();
        Statuses status = new Statuses();
        status.setAlias("SuperPremiumm");
        status.setDescription("This status for Adm");
        statusService.save(status);

        AccountService accountService = new AccountService();
        Accounts accounts = new Accounts();
        accounts.setClientId(16);
        accounts.setNumber("16");
        accounts.setValue(21590.50);
        accountService.save(accounts);

//        Clients clientsById = clientsService.getById(14);
//        System.out.println(clientsById);
//        clientsById.setName("Kratos");
//        clientsById.setEmail("kratosP@gmail.com");
//        clientsService.update(clientsById);

//        Statuses statusesById = statusService.getById(6);
//        System.out.println(statusesById);
//        statusesById.setAlias("Premium-Vip");
//        statusService.update(statusesById);
//
//        Accounts accountById = accountService.getById(14);
//        System.out.println(accountById);
//        accountById.setValue(26700.90);
//        accountService.update(accountById);
//
//        Clients clientForDelete = clientsService.getById(13);
//        clientsService.delete(clientForDelete);
//        Clients clientsGetPhone = clientsService.getByPhone(992346712);
//        System.out.println(clientsGetPhone);
//
//        Statuses statusesForDelete = statusService.getById(6);
//        statusService.delete(statusesForDelete);
//
//        Accounts accountForDelete = accountService.getById(14);
//        accountService.delete(accountForDelete);
    }
}
