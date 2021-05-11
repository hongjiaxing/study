package com.design.patterns.creational.patterns.builderpattern.item.impl.burger;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：汉堡实现类:蔬菜汉堡
 */

public class vagBurger extends Burger {
    @Override
    public String name() {
        return "vagBurger";
    }

    @Override
    public float price() {
        return 3.5f;
    }
}
