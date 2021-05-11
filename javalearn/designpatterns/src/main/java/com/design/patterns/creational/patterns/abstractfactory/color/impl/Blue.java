package com.design.patterns.creational.patterns.abstractfactory.color.impl;

import com.design.patterns.creational.patterns.abstractfactory.color.Color;

/**
 * @author hongjiaxing
 * @date 2021/5/10
 * 描述：
 */

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
