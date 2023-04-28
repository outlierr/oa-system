package com.example.oa.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class PageVO<T> {
    private List<T> records;
    private Long size;
    private Long total;

}
