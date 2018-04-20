package com.cll.action;

public class HelloAction {

    public String execute(){
        System.out.println("使用默认方法");
        return "success";

    }

    public String sayHello(){
        System.out.println("sayHello");
        return "success";
    }

    public String sayHello2(){
        System.out.println("sayHello2");
        return "success";
    }
}
