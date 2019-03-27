package com.khalidhajjari;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Speelveld extends JPanel implements KeyListener {

    public static final int WIDTH = 320;
    public static final int HEIGHT = 240;

    private Thread thread;
    private Graphics2D g;

    public Speelveld(){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
