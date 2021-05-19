package com.practice.awt.frame;

import java.awt.*;

/**
 * @author hongjiaxing
 * @date 2021/5/18
 * 描述：
 */

public class PanelFrame extends Frame {
    public PanelFrame(String title) {
        super(title);
    }

    public static void main(String[] args) {
        PanelFrame panelFrame = new PanelFrame("面板窗口");
        panelFrame.setSize(300, 300);
        panelFrame.setBackground(Color.BLUE);
        panelFrame.setVisible(true);
        // 添加面板，并给面板设置属性
        Panel panel = new Panel();
        panel.setSize(50, 50);
        panel.setBackground(Color.green);
        // 取消布局管理器,不然显示不出来
        panelFrame.setLayout(null);
        panelFrame.add(panel);
    }
}
