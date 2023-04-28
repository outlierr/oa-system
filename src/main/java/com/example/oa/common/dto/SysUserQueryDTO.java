package com.example.oa.common.dto;

import lombok.Data;

@Data
public class SysUserQueryDTO {
    private String keyword;

    private String createTimeBegin;
    private String createTimeEnd;

    private Long roleId;
    private Long postId;
    private Long deptId;
}
