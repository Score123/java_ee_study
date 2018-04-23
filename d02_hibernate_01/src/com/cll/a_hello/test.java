package com.cll.a_hello;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class test {
    @Test
    public void demo1(){
        User user = new User();
        User user2 = new User();
        user.setUsername("wef");
        user.setPassword("12345");

        Configuration config = new Configuration().configure();
        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

        //开启事务
        Transaction tran = session.beginTransaction();


        session.save(user);
        tran.commit();

        //关闭资源
        session.close();
        factory.close();



    }

}
