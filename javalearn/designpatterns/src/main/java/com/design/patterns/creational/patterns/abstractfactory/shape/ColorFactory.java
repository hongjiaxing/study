package com.design.patterns.creational.patterns.abstractfactory.shape;

import com.design.patterns.creational.patterns.abstractfactory.AbstractFactory;
import com.design.patterns.creational.patterns.abstractfactory.color.Color;
import com.design.patterns.creational.patterns.abstractfactory.color.impl.Blue;
import com.design.patterns.creational.patterns.abstractfactory.color.impl.Green;
import com.design.patterns.creational.patterns.abstractfactory.color.impl.Red;

/**
 * @author hongjiaxing
 * @date 2021/5/10
 * 描述：
 */

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
