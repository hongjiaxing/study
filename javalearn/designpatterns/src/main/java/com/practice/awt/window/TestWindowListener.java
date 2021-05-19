package com.practice.awt.window;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author hongjiaxing
 * @date 2021/5/18
 * 描述：让window默认关闭事件生效
 */

public class TestWindowListener implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
