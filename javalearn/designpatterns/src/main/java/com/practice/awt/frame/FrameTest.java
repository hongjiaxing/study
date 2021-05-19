package com.practice.awt.frame;

import java.awt.*;

/**
 * @author hongjiaxing
 * @date 2021/5/18
 * 描述：窗口，但不能与用户交互
 */

public class FrameTest extends Frame {

    public FrameTest(String title) {
        super(title);
    }

    public static void main(String[] args) {
        FrameTest frame = new FrameTest("测试窗口");
        // 设置宽高
        frame.setSize(200, 200);
        // 设置窗口可见
        frame.setVisible(true);
        // 设置窗口颜色
        frame.setBackground(Color.BLUE);
    }

}
