package com.wen.service;

import com.wen.domain.Account;

import java.util.List;

public interface IAccountService {
    public List<Account> findAll();
    public void saveAccount(Account account);
}
