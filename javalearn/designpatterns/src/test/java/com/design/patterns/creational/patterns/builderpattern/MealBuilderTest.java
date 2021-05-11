package com.design.patterns.creational.patterns.builderpattern;

import org.junit.Test;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：建造者测试类
 */

public class MealBuilderTest {
    @Test
    public void testMealBuilder() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.sumPrice());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.sumPrice());
    }

}
