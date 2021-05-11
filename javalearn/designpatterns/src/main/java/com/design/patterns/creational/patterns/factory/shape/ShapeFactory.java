package com.design.patterns.creational.patterns.factory.shape;

import com.design.patterns.creational.patterns.factory.shape.impl.Circle;
import com.design.patterns.creational.patterns.factory.shape.impl.Rectangle;
import com.design.patterns.creational.patterns.factory.shape.impl.Square;

/**
 * @author hongjiaxing
 * @date 2021/5/10
 * 描述：
 */

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
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
