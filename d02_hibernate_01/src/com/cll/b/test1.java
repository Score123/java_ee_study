package com.cll.b;

import com.cll.a_hello.User;
import com.cll.util.HUtil;
import org.hibernate.Session;
import org.junit.Test;

public class test1 {
    @Test
    public void demo1(){
        Session session = HUtil.openSession();
        session.beginTransaction();

        //-----------------------
        User u = new User();
        u.setUsername("tom");
        u.setPassword("123");

        session.save(u);



        //----------------------------
        session.getTransaction().commit();
        session.close();


    }
    @Test
    public void demo2(){
        Session session = HUtil.openSession();
        session.beginTransaction();
        //=====
        User u1 = (User) session.get(User.class,1); //持久态
        User u2 = (User) session.get(User.class,1);
        User u3 = (User) session.get(User.class,1);

        System.out.println(u1==u2);
        System.out.println(u1==u2);
        //---------
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void demo3(){
        Session session = HUtil.openSession();
        session.beginTransaction();
        //=====
        User u1 = (User) session.get(User.class,1); //持久态

        u1.setUsername("jack");
        session.update(u1);
        u1.setUsername("jack2");
        session.update(u1);
        u1.setUsername("jack3");
        session.update(u1);
        //---------
        session.getTransaction().commit();
        session.close();
    }













}

