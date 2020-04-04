package com.example.ssos;

import com.example.ssos.entity.UserEntity;
import com.example.ssos.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SsosApplicationTests {

    @Autowired
    IUserService userService = null;

	@Test
	void contextLoads() {
        System.out.println(1244);
	}

	@Test
	public void findById(){
        UserEntity userEntity = userService.findById(6);
        System.out.println(userEntity.getUserName()+","+userEntity.getPassword());
    }

    @Test
    public void listUser(){
        List<UserEntity> list = userService.listUser();
        for (UserEntity u:list){
            System.out.println(u.getUserName()+","+u.getPassword());
        }
    }
    @Test
    public void addUser(){
	    UserEntity userEntity = new UserEntity("赵云想","776655");
	    userService.saveUser(userEntity);
    }
}
