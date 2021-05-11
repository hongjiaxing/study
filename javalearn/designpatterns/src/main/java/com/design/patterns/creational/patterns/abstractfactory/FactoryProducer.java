package com.design.patterns.creational.patterns.abstractfactory;

import com.design.patterns.creational.patterns.abstractfactory.shape.ColorFactory;

/**
 * @author hongjiaxing
 * @date 2021/5/10
 * 描述：
 */

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
