package com.example.ssos.controller;

import com.example.ssos.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GotoPage {

    @Autowired
    IUserService userService = null;

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("getAddUser")
    public String getAddPage(){
        return "addPage";
    }


    /**
     * 跳转到修改页面
     * @param userId
     * @return
     */
    @RequestMapping("getUpdatePage")
    public ModelAndView getUpdatePage(int userId){
        ModelAndView mv = new ModelAndView("updatePage");
        mv.addObject("user",userService.findById(userId));
        return mv;
    }

}
