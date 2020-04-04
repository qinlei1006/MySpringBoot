package com.example.ssos.controller;

import com.example.ssos.entity.UserEntity;
import com.example.ssos.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LeafUserController {

    @Autowired
    private IUserService userService;


    int userId ;
    /**
     * 添加用户
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping("addUserInfo")
    public ModelAndView addUser(String userName,String password){
          ModelAndView mv = new ModelAndView();
        UserEntity userEntity = new UserEntity(userName,password);
        userService.saveUser(userEntity);
        userId = userEntity.getUserId();
//        重定向页面
        RedirectView rv = new RedirectView("getUserMapping");
        mv.setView(rv);
          return mv;
    }

    /**
     * 按照id查询用户
     * @return
     */
    @RequestMapping("getUserMapping")
    public ModelAndView getUser(){
        ModelAndView mv = new ModelAndView("getUser");
        UserEntity userEntity = userService.findById(userId);
        mv.addObject("user",userEntity);
        mv.addObject(userEntity);
        return mv;
    }

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("findUserListInfo")
    public ModelAndView findUserListInfo(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList",userService.listUser());
        mv.setViewName("listUser");
        return mv;
    }

    /**
     *按照id删除用户
     * @param userId
     * @return
     */
    @RequestMapping("deleteUser")
    public ModelAndView deleteUser(int userId){
        ModelAndView mv = new ModelAndView();
        userService.deleteUser(userId);
        RedirectView rv = new RedirectView("findUserListInfo");
        mv.setView(rv);
        return mv;
    }

    /**
     * 修改用户信息
     * @param userName
     * @param password
     * @param userId
     * @return
     */
    @RequestMapping("updateUserInfo")
    public ModelAndView updateUserInfo(String userName,String password,int userId){
        ModelAndView mv = new ModelAndView();
         UserEntity user = new UserEntity();
         user.setUserId(userId);
        user.setUserName(userName);
        user.setPassword(password);
        userService.saveUser(user);
        RedirectView rv = new RedirectView("findUserListInfo");
        mv.setView(rv);
        return mv;
    }


}
