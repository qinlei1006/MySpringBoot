package com.example.ssos.controller;


import com.example.ssos.entity.UserEntity;
import com.example.ssos.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserEntity userEntity;
    @RequestMapping("hello")
    public  UserEntity hello(){
        return userEntity;
    }

    @RequestMapping("addUser")
    public String addUser(String userName,String password){
        String returnStr = "no";
        if (userName != null && userName.length() >0  && password != null && password.length() > 0){
           UserEntity user = new UserEntity();
            user.setUserName(userName);
            user.setPassword(password);
            userService.saveUser(user);
            returnStr = "ok";
        }

        return returnStr;
    }
}
