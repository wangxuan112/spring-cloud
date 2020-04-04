package com.xuan.distributed.lock.common.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Administrator
 */
@Data
@Builder
public class UserVO implements Serializable {
    private String id;

    private Integer age;

    private String userName;

    private String password;
}
