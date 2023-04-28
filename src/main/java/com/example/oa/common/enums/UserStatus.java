package com.example.oa.common.enums;

public enum UserStatus {
    OK(1, "正常"), DISABLE(0, "停用");

    private final Integer code;
    private final String info;

    UserStatus(Integer code, String info)
    {
        this.code = code;
        this.info = info;
    }

    public Integer getCode()
    {
        return code;
    }

    public String getInfo()
    {
        return info;
    }
}
