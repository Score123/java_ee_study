package com.cll.c_one2many;

import com.cll.domain.Customer;
import com.cll.domain.Order;
import com.cll.util.HUtil;
import org.hibernate.Session;
import org.junit.Test;

public class demo1 {

    @Test
    public void fun1(){
        Session session = HUtil.openSession();
        session.beginTransaction();
        //-------------------
        Customer c = new Customer();
        Order o1 = new Order();
        Order o2 = new Order();
        c.setName("张三");
        o1.setName("dd");
        o2.setName("ee");
        c.getOrders().add(o1);
        c.getOrders().add(o2);

        o1.setCustomer(c);
        o2.setCustomer(c);

        session.save(c);
        session.save(o1);
        session.save(o2);

        //-------------------
        session.getTransaction().commit();
        session.close();
    }
    @Test
    public void fun2(){
        Session session = HUtil.openSession();
        session.beginTransaction();

        Customer customer = (Customer) session.get(Customer.class, 2);

        session.delete(customer );
        session.getTransaction().commit();
    }
}
