package com.practice.awt.frame;

import com.practice.awt.window.TestWindowListener;

import java.awt.*;

/**
 * @author hongjiaxing
 * @date 2021/5/18
 * 描述：使window事件生效
 */

public class WindowEventFrameTest {
    public static void main(String[] args) {
        Frame frame = new Frame("事件窗口");
        frame.setSize(500, 500);
        frame.addWindowListener(new TestWindowListener());
        frame.setVisible(true);
    }
}
