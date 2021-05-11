package com.design.patterns.creational.patterns.abstractfactory;

import com.design.patterns.creational.patterns.abstractfactory.color.Color;
import com.design.patterns.creational.patterns.abstractfactory.shape.Shape;
import com.design.patterns.creational.patterns.abstractfactory.shape.impl.Circle;
import com.design.patterns.creational.patterns.abstractfactory.shape.impl.Rectangle;
import com.design.patterns.creational.patterns.abstractfactory.shape.impl.Square;

/**
 * @author hongjiaxing
 * @date 2021/5/10
 * 描述：
 */

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
