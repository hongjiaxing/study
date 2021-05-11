package com.design.patterns.creational.patterns.builderpattern.item.impl.burger;

import com.design.patterns.creational.patterns.builderpattern.item.Item;
import com.design.patterns.creational.patterns.builderpattern.packing.Packing;
import com.design.patterns.creational.patterns.builderpattern.packing.impl.Wrapper;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：抽象类，用于所有的汉堡打包方式都相同
 */

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
