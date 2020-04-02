package com.example.springboots.dao;

import com.example.springboots.bean.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    public List<UserBean> findListUser();
}
