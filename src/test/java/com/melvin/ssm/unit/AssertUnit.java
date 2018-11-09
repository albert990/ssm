package com.melvin.ssm.unit;

import com.melvin.ssm.entity.User;
import org.junit.Test;
import org.springframework.util.Assert;

import java.util.Date;

public class AssertUnit {

    @Test
    public void testAssert(){
        User user=new User();
        user.setScore(100);
        user.setCreateTime(new Date());
        user.setUserName("mingming");
        user.setUserId(10000l);
        try {
            Assert.notNull(user.getUserPhone(),"手机号码不能为空");
            Assert.isTrue(user.getUserName().equalsIgnoreCase("Mingan"),"登录用户已过期，请重新登录！");
        } catch (Exception e) {
            System.out.println("------------------------");
            e.printStackTrace();
            System.out.println("------------------------");
        }
    }
}
