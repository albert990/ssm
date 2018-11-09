package com.melvin.ssm.dao;

import com.melvin.ssm.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;

    @Test
    public void testQueryAllOrders(){
        List<Order> list = orderDao.queryAll(0, 100);
        for (Order order : list) {
            System.out.println(order);
        }
        System.out.println("-------------------------------------");
    }
}
