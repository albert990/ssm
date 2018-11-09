package com.melvin.ssm.dao;

import com.melvin.ssm.entity.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class GoodsDaoTest {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void testQueryAll() {
        List<Goods> goods = goodsDao.queryAll(0, 100);
        if (goods != null) {
            LOG.debug("共查询商品数："+goods.size());
            for (Goods g : goods) {
                System.out.println(g);
            }
        }
        System.out.println("-------------------------------------");
    }

}
