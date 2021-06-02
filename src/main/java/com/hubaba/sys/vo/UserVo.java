package com.hubaba.sys.vo;

import com.hubaba.sys.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author admin
 * @create 2021/2/21 10:08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends User {

    private Integer page=1;
    private Integer limit=10;

    /**
     * 验证码
     */
    private String code;
}
