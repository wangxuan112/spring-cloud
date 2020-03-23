package com.xuan.test;

import com.xuan.spring.boot.sharding.jdbc.ShardingJdbcApplication;
import com.xuan.spring.boot.sharding.jdbc.common.model.Orders;
import com.xuan.spring.boot.sharding.jdbc.mapper.OrdersDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcApplication.class)
public class OrdersDaoTest {

    @Resource
    private OrdersDao ordersDao;

    @Test
    public void name() {
        List<Orders> all = ordersDao.getAll();
        System.out.println(all);
    }
}
