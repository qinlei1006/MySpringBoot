package com.example.springboots.service.impl;

import com.example.springboots.bean.UserBean;
import com.example.springboots.dao.IUserDao;
import com.example.springboots.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    //注入DAO
    @Autowired
    private IUserDao userDao;
    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserBean> findListUser() {
        return userDao.findListUser();
    }

    /**
     * 添加用户
     *
     * @param userBean
     */
    @Override
    public void addUser(UserBean userBean) {
        userDao.addUser(userBean);
    }
}
