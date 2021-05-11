package com.design.patterns.creational.patterns.abstractfactory;

import com.design.patterns.creational.patterns.abstractfactory.color.Color;
import com.design.patterns.creational.patterns.abstractfactory.shape.Shape;

/**
 * @author hongjiaxing
 * @date 2021/5/10
 * 描述：抽象工厂类，用来创建衣服、裤子的抽象工厂类
 */

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
