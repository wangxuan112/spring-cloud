package com.xuan.spring.boot.sharding.jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xuan.spring.boot.sharding.jdbc.common.model.Orders;

import java.util.List;

/**
 * @author : TondDun-001
 * @date : 2020-03-23 16:18
 */
public interface OrdersDao extends BaseMapper<Orders> {

    List<Orders> getAll();
}