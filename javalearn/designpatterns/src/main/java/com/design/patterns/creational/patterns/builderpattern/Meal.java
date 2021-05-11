package com.design.patterns.creational.patterns.builderpattern;

import com.design.patterns.creational.patterns.builderpattern.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongjiaxing
 * @date 2021/5/11
 * 描述：套餐，比如一个鸡肉汉堡、一个冰可乐(建造者模式，用来存储不同组合)
 */

public class Meal {
    // 套餐
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public float sumPrice() {
        float cost = 0.0f;
        for (Item item : items) cost += item.price();
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
