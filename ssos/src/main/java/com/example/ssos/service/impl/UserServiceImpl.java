package com.example.ssos.service.impl;

import com.example.ssos.dao.IUserDao;
import com.example.ssos.entity.UserEntity;
import com.example.ssos.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void saveUser(UserEntity userEntity) {
        userDao.save(userEntity);
    }


}
