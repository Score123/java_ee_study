package com.cll.dao.imp;

import com.cll.dao.IUserDao;
import com.cll.domain.User2;
import com.cll.util.DBCPUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class IUserDaoImp implements IUserDao {
    private QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
    @Override
    public User2 selectUserByUsername(String name) {

        try {
            return qr.query("select * from user where name=?",new BeanHandler<User2>(User2.class),name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int addUser(User2 user) {
        try {
            return qr.update("insert into user(name,age,hobby,married,birthday) values(?,?,?,?,?)",
                    user.getName(),user.getAge(),user.getHobby(),user.isMarried(),user.getBirthday());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
