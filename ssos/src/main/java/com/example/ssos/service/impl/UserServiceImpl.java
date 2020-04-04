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

    /**
     * 查询所有用户
     */
    @Override
    public List<UserEntity> listUser() {
        return (List<UserEntity>) userDao.findAll();
    }

    /**
     * 按照名字查询
     * @return
     */
    @Override
    public UserEntity findById(int id) {
        return userDao.findById(id).get();
    }

    /**
     * 按照id删除用户
     *
     * @param userId
     */
    @Override
    public void deleteUser(int userId) {
        userDao.deleteById(userId);
    }


}
