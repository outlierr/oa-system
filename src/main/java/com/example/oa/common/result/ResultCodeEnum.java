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
    FAIL(201, "失败"),
    ACCOUNT_STOP(202,"账户禁用"),

    SERVICE_ERROR(2012, "服务异常"),
    DATA_ERROR(204, "数据异常"),

    LOGIN_AUTH(208, "未登陆"),
    LOGIN_ERROR(401, "认证失败"),
    PERMISSION(403, "没有权限"),

    ;

    private Integer code;

    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
