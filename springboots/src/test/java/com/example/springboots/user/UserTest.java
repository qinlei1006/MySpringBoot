package com.example.springboots.user;

import com.example.springboots.SpringbootsApplication;
import com.example.springboots.bean.UserBean;
import com.example.springboots.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootsApplication.class)
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void findUserList(){
        List<UserBean> userBeans = userService.findListUser();
        for (UserBean u:userBeans){
            System.out.println(u.getUserName());
        }
    }

}
