package com.example.oa.common.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.oa.common.vo.PageVO;

public class PageUtil {
    public static <T> PageVO<T> genPageVO(IPage<T> page) {
        return new PageVO<>(page.getRecords(), page.getTotal(), page.getSize());
    }
}
