package com.practice.awt.layoutmanager;

import java.awt.*;

/**
 * @author hongjiaxing
 * @date 2021/5/18
 * 描述：FlowLayout布局使用
 */

public class FlowLayoutTest {

    public static void main(String[] args) {
        Frame frame = new Frame();
        // 创建一个布局管理器,默认为居中
//        LayoutManager manager = new FlowLayout();
        // 布局居左,左右间距,上下间距
        LayoutManager manager = new FlowLayout(FlowLayout.LEFT,50,5);
        frame.setSize(300, 300);
        frame.setLayout(manager);
        frame.add(new Button("yes"));
        frame.add(new Button("no"));
        frame.add(new Button("close"));
        frame.setVisible(true);
    }
}
