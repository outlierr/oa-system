package com.example.oa.exception;

import com.example.oa.common.result.ResultCodeEnum;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ServiceException extends RuntimeException{

    private Integer code;

    private String message;

    public ServiceException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * 通过状态码和错误消息创建异常对象
     * @param code
     * @param message
     */
    public ServiceException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 接收枚举类型对象
     * @param resultCodeEnum
     */
    public ServiceException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }
}