package org.example.service;

import org.example.dao.AccountDao;
import org.example.entity.Accounts;

public class AccountService {

    private AccountDao accountDao = new AccountDao();

    public void save(Accounts accounts) {
        System.out.println("Account for save: " + accounts.toString());
        accountDao.save(accounts);
    }

    public void update(Accounts accounts) {
        System.out.println("Account for update: " + accounts.toString());
        accountDao.update(accounts);
    }

    public void delete(Accounts accounts) {
        System.out.println("Account for deleting: " + accounts.toString());
        accountDao.delete(accounts);
    }

    public Accounts getById(int id) {
        System.out.println("Id for getting Account: " + id);
        return accountDao.getById(id);
    }
}
