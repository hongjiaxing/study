package com.design.patterns.creational.patterns.builderpattern.item.impl.coldDrink;

import com.design.patterns.creational.patterns.builderpattern.item.Item;
import com.design.patterns.creational.patterns.builderpattern.packing.Packing;
import com.design.patterns.creational.patterns.builderpattern.packing.impl.Bottle;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：套餐单品抽象类:冷饮
 */

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
