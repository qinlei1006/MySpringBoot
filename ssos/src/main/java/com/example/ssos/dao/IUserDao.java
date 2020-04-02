package com.example.ssos.dao;

import com.example.ssos.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<UserEntity,Integer> {
}
