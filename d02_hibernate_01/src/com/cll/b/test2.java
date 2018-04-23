package com.cll.b;

import com.cll.a_hello.User;
import com.cll.util.HUtil;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

public class test2 {
    @Test
    public void fun1() {
        Session session = HUtil.openSession();
        session.beginTransaction();
        //-----------------
        User user = new User();
        user.setUsername("tom");
        user.setPassword("1234");
        user.setId(99); //使用save，会忽略id
//        session.persist(user);
        session.save(user);
        //-------
        session.getTransaction().commit();
        session.close();
    }
    @Test
    public void fun2(){
        Session session = HUtil.openSession();
        session.beginTransaction();
        //-----------------
//        User user = new User();
//        user.setUsername("tom");
//        user.setPassword("1234");
        //这样使用就加入到了缓存中了
        List<User> list = session.createSQLQuery("select * from t_user").addEntity(User.class).list();
        System.out.println(list);
        User u1 = (User) session.get(User.class,1);
        System.out.println(u1);
        //session.save(user);
        //-------------------
        session.getTransaction().commit();
        session.close();
    }
}
