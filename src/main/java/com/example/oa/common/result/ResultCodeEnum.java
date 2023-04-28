package com.example.oa.common.result;

import lombok.Getter;

/**
 * 统一返回结果状态信息类
 * @author: Lin
 * @since: 2023-03-01
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200,"成功"),
    LOGIN_ERROR(401, "认证失败"),
    PERMISSION(403, "没有权限"),
    ERROR(500, "失败"),


    ;

    private Integer code;

    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
