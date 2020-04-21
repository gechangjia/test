package com.wen.test;

import com.wen.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext at=new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService as=(IAccountService) at.getBean("accountService");
        as.findAll();
    }
}
