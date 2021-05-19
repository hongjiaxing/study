package com.practice.awt.layoutmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author hongjiaxing
 * @date 2021/5/18
 * 描述：CardLayout布局管理器能够帮助用户处理两个以上甚至更多的成员共享同一显示空间，
 * 它把容器分成很多层，每层的显示空间占据整个容器的大小，
 * 但是每一层只允许放置一个组件，
 * 每层都可以利用Panel来实现复杂的用户界面；
 * CardLayout布局管理器就像是一副叠好的扑克牌一样，
 * 有54张，但是你只能看到最上面的一张牌；
 * 常用的方法有：
 * first(Container parent); //显示第一张卡片
 * last(Container parent); //显示最后一张卡片
 * next(Container parent); //显示下一张卡片
 * previous(Container parent); //显示前一张卡片
 * show(Container parent，String name); //显示指定名称的卡片
 */

public class CardLayoutTest implements ActionListener {
    private Frame frame;

    private CardLayout cardLayout;

    public static void main(String[] args) {
        CardLayoutTest cardLayoutTest = new CardLayoutTest();
        cardLayoutTest.createFrame();
    }

    public void createFrame() {
        frame = new Frame("卡片层叠式布局");
        frame.setSize(300, 300);

        // 创建三个按钮，并添加事件
        Button b1 = new Button("one");
        b1.addActionListener(this);
        Button b2 = new Button("two");
        b2.addActionListener(this);
        Button b3 = new Button("three");
        b3.addActionListener(this);

        Panel p1 = new Panel();
        p1.add(b1);
        Panel p2 = new Panel();
        p2.add(b2);
        Panel p3 = new Panel();
        p3.add(b3);

        // 设置布局为卡片层叠布局
        cardLayout = new CardLayout();
        frame.setLayout(cardLayout);

        // 添加三个组件
        frame.add(p1, "第一层");
        frame.add(p2, "第二层");
        frame.add(p3, "第三层");

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 每次点击获取下一个
        cardLayout.next(frame);
    }
}
