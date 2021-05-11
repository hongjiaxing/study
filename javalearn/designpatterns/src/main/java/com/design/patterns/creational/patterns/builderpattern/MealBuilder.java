package com.design.patterns.creational.patterns.builderpattern;

import com.design.patterns.creational.patterns.builderpattern.item.Item;
import com.design.patterns.creational.patterns.builderpattern.item.impl.burger.ChickenBurger;
import com.design.patterns.creational.patterns.builderpattern.item.impl.burger.vagBurger;
import com.design.patterns.creational.patterns.builderpattern.item.impl.coldDrink.Coke;
import com.design.patterns.creational.patterns.builderpattern.item.impl.coldDrink.Pepsi;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：建造者:创建不同的套餐，将单一的对象组合成复杂的对象
 */

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        Item burger = new vagBurger();
        Item coldDrink = new Coke();
        meal.addItem(burger);
        meal.addItem(coldDrink);
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        Item burger = new ChickenBurger();
        Item coldDrink = new Pepsi();
        meal.addItem(burger);
        meal.addItem(coldDrink);
        return meal;
    }
}
