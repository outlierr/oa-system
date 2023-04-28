package com.example.oa.common.enums;

public enum MenuType {
    DIRECTORY(0, "目录"), MENU(1, "菜单"), BUTTON(2, "按钮");

    private final Integer code;
    private final String info;

    MenuType(Integer code, String info)
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
