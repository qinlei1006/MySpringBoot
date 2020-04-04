package com.example.ssos.service;

import com.example.ssos.entity.UserEntity;

import java.util.List;

public interface IUserService {

    /**
     * 添加用户
     * @param userEntity
     */
     void saveUser(UserEntity userEntity);
    /**
     * 查询所有用户
     */
     List<UserEntity> listUser();

    /**
     * 按照名字查询
     * @return
     */
     UserEntity findById(int id);

    /**
     * 按照id删除用户
     * @param userId
     */
     void deleteUser(int userId);


}
