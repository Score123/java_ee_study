package com.cll.action;

import com.cll.domain.User2;
import com.cll.service.IUserService;
import com.cll.service.imp.IUserServiceImp;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<User2> {

    private User2 user = new User2();
    private IUserService service = new IUserServiceImp();

    @Override
    public User2 getModel() {
        return user;
    }

    public String register(){

        System.out.println(user.toString());
        User2 dbuser = service.findUserByUsername(user.getName());
        if (dbuser!=null){
            return "exists";
        }
        //不存在
        int res = service.register(user);
        if (res>0){
            return SUCCESS;
        }else {
            return null;
        }
    }
}
