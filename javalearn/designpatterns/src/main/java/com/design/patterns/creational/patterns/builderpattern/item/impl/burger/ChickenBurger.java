package com.design.patterns.creational.patterns.builderpattern.item.impl.burger;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：汉堡实现类:鸡肉汉堡
 */

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 5.8f;
    }
}
