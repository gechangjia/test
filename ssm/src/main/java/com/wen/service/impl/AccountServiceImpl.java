package com.wen.service.impl;

import com.wen.dao.IAccountDao;
import com.wen.domain.Account;
import com.wen.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("查询所有执行了");
        List<Account> list=accountDao.findAll();
        return list;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
