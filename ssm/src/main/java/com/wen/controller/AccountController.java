package com.wen.controller;

import com.wen.domain.Account;
import com.wen.service.IAccountService;
import com.wen.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("成功");
        List<Account> list=accountService.findAll();
        for (Account account:list){
            System.out.println(account);
        }
        return "success";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("成功");
        accountService.saveAccount(account);
        return "success";
    }
}
