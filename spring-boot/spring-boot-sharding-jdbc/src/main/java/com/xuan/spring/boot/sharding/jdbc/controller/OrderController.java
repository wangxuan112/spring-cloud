package com.xuan.spring.boot.sharding.jdbc.controller;

import com.xuan.spring.boot.sharding.jdbc.common.model.Order;
import com.xuan.spring.boot.sharding.jdbc.mapper.OrdersDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : TondDun-001
 * @date : 2020-03-23 16:19
 */

@RestController
public class OrderController {

    @Resource
    private OrdersDao ordersDao;

    @GetMapping("orders")
    public List<Order> getAll() {
        return ordersDao.getAll();
    }
}
