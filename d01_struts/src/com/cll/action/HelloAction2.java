package com.cll.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class HelloAction2 extends ActionSupport {

    public String execute(){

        return SUCCESS;
    }

    public String action2(){
        HttpServletRequest request = ServletActionContext.getRequest();
        return SUCCESS;
    }
}
