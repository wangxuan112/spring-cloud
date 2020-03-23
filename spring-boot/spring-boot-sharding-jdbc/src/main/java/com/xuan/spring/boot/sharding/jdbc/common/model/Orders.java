package com.xuan.spring.boot.sharding.jdbc.common.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : TondDun-001
 * @date : 2020-03-23 16:16
 */
@Data
@ToString
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Long payAmount;

    private String status;

    private Date addTime;

    private Date lastUpdateTime;


}