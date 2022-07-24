package com.aha.dto;

import com.aha.model.MetaDomain;

/**
 * 标签、分类列表
 * Created by winterchen on 2018/4/30.
 */
public class MetaDto extends MetaDomain {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
