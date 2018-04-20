package com.cll.action;

import com.cll.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class User1Action extends ActionSupport {
    /**
     * 直接通过表单，没有封装对象
     */
    private String name;
    private int age;


    public User getUser() {
        System.out.println("getUser");
        return user;
    }

    public void setUser(User user) {
        System.out.println("setUser");
        this.user = user;
    }

    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String saveUser(){
        System.out.println(name+"+"+age);
        return null;
    }

    /**
     * 字段和动作名要相同
     * @return
     */
    public String registerUser(){
        System.out.println(name+"+"+age);
        return null;
    }


    /**
     * 字段和动作名要相同, 使用封装的对象
     * @return
     */
    public String registerUser2(){
        System.out.println(user.getName()+"+"+user.getAge());
        return null;
    }


}
