package com.melvin.ssm.service.impl;

import com.melvin.ssm.BaseTest;
import com.melvin.ssm.entity.User;
import com.melvin.ssm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImplTest extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUserListTest(){
        List<User> list = userService.getUserList(0, 100);
        for (User user : list) {
            System.out.println(user);
        }
    }
}
