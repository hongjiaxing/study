package com.design.patterns.creational.patterns.builderpattern.item.impl.coldDrink;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：冷饮：可口可乐
 */

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
