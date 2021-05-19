package com.practice.awt.layoutmanager;

import java.awt.*;

/**
 * @author hongjiaxing
 * @date 2021/5/18
 * 描述：BorderLayout是Window、Frame和Dialog的默认布局管理器；
 * BorderLayout布局管理器把容器分成五个区域：North，South，East，West和Center，
 * 每个区域只能放置一个组件；
 * 在用add（）方法的时候要标明添加到哪个位置，如果容器的大小发生变化，
 * 例如容器变高了，则North，South区域不变，West，Center，East区域变高；
 */

public class BorderLayoutTest {
    public static void main(String[] args) {
        Frame frame = new Frame("边框布局");
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        // 这里必须指定需要把组件放置的区域
        frame.add(BorderLayout.NORTH,new Button(BorderLayout.NORTH));
        frame.add(BorderLayout.SOUTH,new Button(BorderLayout.SOUTH));
        frame.add(BorderLayout.EAST,new Button(BorderLayout.EAST));
        frame.add(BorderLayout.WEST,new Button(BorderLayout.WEST));
        frame.add(BorderLayout.CENTER,new Button(BorderLayout.CENTER));
        frame.setVisible(true);
    }
}
