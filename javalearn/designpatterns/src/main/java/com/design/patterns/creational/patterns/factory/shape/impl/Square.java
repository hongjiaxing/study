package com.design.patterns.creational.patterns.factory.shape.impl;

import com.design.patterns.creational.patterns.factory.shape.Shape;

/**
 * @author hongjiaxing
 * @date 2021/5/10
 * 描述：
 */

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
