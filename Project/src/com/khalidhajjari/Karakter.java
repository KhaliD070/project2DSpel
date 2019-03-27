package com.khalidhajjari;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Karakter extends JFrame implements KeyListener {


    KarakterComponent karakter;
    onbreekbaarBarricade barricade;
    LeegVak vak;

    public Karakter() {
        this.karakter = new KarakterComponent();
        this.barricade = new onbreekbaarBarricade();
        this.vak = new LeegVak();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            karakter.moveRight();
        else if (e.getKeyCode() == KeyEvent.VK_LEFT)
            karakter.moveLeft();
        else if (e.getKeyCode() == KeyEvent.VK_DOWN)
            karakter.moveDown();
        else if (e.getKeyCode() == KeyEvent.VK_UP)
            karakter.moveUp();

        if(karakter.x >= vak.MAXX){
            karakter.x = vak.MAXX-vak.WIDTH;
        }if(karakter.y >= vak.MAXY){
            karakter.y = vak.MAXY-vak.HEIGHT;
        }if(karakter.x < 0){
            karakter.x = 0;
        }if(karakter.y < 0){
            karakter.y = 0;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
