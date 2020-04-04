package com.xuan.spring.boot.sharding.jdbc.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : TondDun-001
 * @date : 2020-03-23 16:16
 */
@Data
@ToString
@Builder
@TableName("t_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;

    private Integer userId;

    private Integer productId;

    private Long payAmount;

    private String status;

    private Date addTime;

    private Date lastUpdateTime;
}