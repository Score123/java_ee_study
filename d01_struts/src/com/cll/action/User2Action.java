package com.cll.action;

import com.cll.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sun.rmi.server.UnicastServerRef;

public class User2Action extends ActionSupport implements ModelDriven<User> {


    /**
     * 直接通过表单，没有封装对象
     */
    private User user = new User();
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    /**
     * 字段和动作名要相同
     * @return
     */
    public String registerUser(){
        System.out.println(user);
        return null;
    }


    @Override
    public User getModel() {
        return user;
    }
}
