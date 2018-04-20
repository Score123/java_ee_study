package com.cll.util;

import com.cll.domain.User2;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.util.Properties;

public class DBCPUtil {

    private static DataSource ds;

    static{
          try {
              Properties prop = new Properties();
              InputStream in = DBCPUtil.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
              prop.load(in);
              ds = BasicDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
           throw new ExceptionInInitializerError("连接池初始化异常");
        }
    }
    /**
     * 获取数据源的方法
     */
    public static DataSource getDataSource(){
        return ds;
    }
    /**
     * 获取连接的方法
     */
    public static Connection getConnection(){
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//    @Test
//    public void test(){
//        System.out.println("sd");
//        try {
//            System.out.println(ds.getConnection());
//            QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
//            User2 wd = qr.query("select * from user where name=?", new BeanHandler<User2>(User2.class), "wd");
//            System.out.println(wd.getName());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }


}
