package com.design.patterns.creational.patterns.builderpattern.packing.impl;

import com.design.patterns.creational.patterns.builderpattern.packing.Packing;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：打包方式使用：包装纸
 */
@Getter
@Setter
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
