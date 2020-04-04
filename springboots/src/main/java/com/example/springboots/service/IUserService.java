package com.example.springboots.service;

import com.example.springboots.bean.UserBean;

import java.util.List;

public interface IUserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<UserBean> findListUser();

    /**
     * 添加用户
     * @param userBean
     */
    public void addUser(UserBean userBean);
}
