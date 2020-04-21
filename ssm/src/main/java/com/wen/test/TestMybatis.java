package com.wen.test;

import com.wen.dao.IAccountDao;
import com.wen.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws Exception{
        //加载配置文件
        InputStream is= Resources.getResourceAsStream("applicationContext.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        //创建SqlSession对象
        SqlSession session=factory.openSession();
        //获取代理对象
        IAccountDao accountDao=session.getMapper(IAccountDao.class);
        //查询所有
        List<Account> accounts=accountDao.findAll();
        for (Account account:accounts){
            System.out.println(account);
        }
        //关闭流
        session.close();
        is.close();
    }
}
