package com.xuan.spring.boot.sharding.jdbc.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : TondDun-001
 * @date : 2020-03-23 16:16
 */
@Data
@Builder
@TableName("t_user")
public class User implements Serializable {
    private static final long serialVersionUID = 2L;
    @Id
    private Long id;

    private String password;

    private String name;

    private Integer age;

    private String email;

    private Date addTime;

    private Integer status;
}