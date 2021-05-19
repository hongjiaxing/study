package com.practice.awt.layoutmanager;

import java.awt.*;

/**
 * @author hongjiaxing
 * @date 2021/5/18
 * 描述：GridLayout布局管理器使容器中的各个组件呈网格状布局，
 * 平均占据容器的空间，即使容器的大小发生变化，每个组件还是平均占据容器的空间。
 */

public class GridLayoutTest {
    public static void main(String[] args) {
        Frame frame =new Frame("网格布局");
        // 三行两列的布局
        LayoutManager manager = new GridLayout(3,2);
        frame.setLayout(manager);
        frame.setSize(500,500);
        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.setVisible(true);
    }
}
