package com.xuan.test;

import com.xuan.spring.boot.sharding.jdbc.ShardingJdbcApplication;
import com.xuan.spring.boot.sharding.jdbc.common.model.Order;
import com.xuan.spring.boot.sharding.jdbc.mapper.OrdersDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcApplication.class)
public class OrderDaoTest {

    @Resource
    private OrdersDao ordersDao;

    @Test
    public void selectAll() {
        List<Order> all = ordersDao.getAll();
        System.out.println(all.toString());
    }


    @Test
    public void selectByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(1243460549871140866L);
        ids.add(1243460560499507202L);
        ordersDao.selectBatchIds(ids);
    }

    @Test
    public void insert() {
        for (int i = 0; i < 4; i++) {
            Order orders = Order.builder().productId(3).userId(5).status("success").payAmount(3L).build();
            ordersDao.insert(orders);
            orders = Order.builder().productId(3).userId(6).status("success").payAmount(3L).build();
            ordersDao.insert(orders);
        }
    }
}
