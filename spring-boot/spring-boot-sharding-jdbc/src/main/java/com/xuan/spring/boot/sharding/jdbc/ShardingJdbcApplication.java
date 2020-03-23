package com.xuan.spring.boot.sharding.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : TondDun-001
 * @date : 2020-03-23 16:02
 */
@SpringBootApplication
@MapperScan("com.xuan.spring.boot.sharding.jdbc.mapper*")
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
