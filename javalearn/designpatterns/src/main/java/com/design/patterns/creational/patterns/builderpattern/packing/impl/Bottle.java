package com.design.patterns.creational.patterns.builderpattern.packing.impl;

import com.design.patterns.creational.patterns.builderpattern.packing.Packing;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：打包方式:瓶装
 */

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
