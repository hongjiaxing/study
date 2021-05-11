package com.design.patterns.creational.patterns.builderpattern.item;

import com.design.patterns.creational.patterns.builderpattern.packing.Packing;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：创建一个表示食物条目接口（如一个汉堡、一杯可乐）。
 */

public interface Item {
    String name();

    Packing packing();

    float price();
}
