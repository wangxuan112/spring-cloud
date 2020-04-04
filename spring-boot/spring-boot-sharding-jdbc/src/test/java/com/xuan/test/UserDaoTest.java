package com.xuan.test;

import com.xuan.spring.boot.sharding.jdbc.ShardingJdbcApplication;
import com.xuan.spring.boot.sharding.jdbc.common.model.Order;
import com.xuan.spring.boot.sharding.jdbc.common.model.User;
import com.xuan.spring.boot.sharding.jdbc.mapper.OrdersDao;
import com.xuan.spring.boot.sharding.jdbc.mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcApplication.class)
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void getById() {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        List<User> all = userDao.selectBatchIds(ids);
        System.out.println(all.toString());
    }

    @Test
    public void insert() {
        User user = User.builder().name("wangxuan").password("123456").age(12).email("734217831@qq.com").status(1).build();
        userDao.insert(user);
    }
}
