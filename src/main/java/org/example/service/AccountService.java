package org.example.service;

import org.apache.log4j.Logger;
import org.example.dao.AccountDao;
import org.example.entity.Accounts;

public class AccountService {

    private final AccountDao accountDao = new AccountDao();
    private final Logger logger = Logger.getLogger(AccountService.class);

    public void save(Accounts accounts) {
        logger.debug(accounts);
        accountDao.save(accounts);
    }

    public void update(Accounts accounts) {
        logger.debug(accounts);
        accountDao.update(accounts);
    }

    public void delete(Accounts accounts) {
        logger.debug(accounts);
        accountDao.delete(accounts);
    }

    public Accounts getById(int id) {
        logger.debug(id);
        return accountDao.getById(id);
    }
}
