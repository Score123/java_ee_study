package com.cll.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HUtil {

    private static SessionFactory sf;
    static {
        Configuration config = new Configuration().configure();
        sf = config.buildSessionFactory();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("虚拟机关闭！资源释放");
                sf.close();
            }
        }));
    }
    public static Session openSession(){
        return sf.openSession();
    }
    public static Session getCurrentSession(){
        return sf.getCurrentSession();
    }

}
