package com.khalidhajjari;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.geom.Ellipse2D;

public class KarakterComponent extends JComponent {
    LeegVak vak = new LeegVak();
    breekbareBarricade b = new breekbareBarricade();

    int x = vak.MAXX / vak.MAXX * vak.WIDTH / vak.WIDTH;
    int y = vak.MAXY / vak.MAXY * vak.HEIGHT / vak.HEIGHT;

    int HEIGHT = vak.HEIGHT;
    int WIDTH = vak.WIDTH;


    public void paintComponent(Graphics g) {
        Graphics g2 = g;
        g2.fillRect(x, y, WIDTH, HEIGHT);
    }


    public int moveRight() {

            if(b.toegangBarricade(x, y)) {
                x = x + WIDTH;
                repaint();
            }else{
                x = x + 0;
            }

        return x;
//
//        if (x > 125 && x < 226 && y > 225 && y < 326) {
//            x = 125;
//        }
//
//        if (x > 125 && x < 226 && y > 225 && y < 326) {
//            x = 125;
//        }
//
//        if (x > 325 && x < 426 && y > 325 && y < 426) {
//
//        }
//
//        if (x > 625 && x < 726 && y > 625 && y < 726 ){
//        }
//
//
//
//
//
//        if (x > 525 && x < 626 && y > 525 && y < 626) {
//
//        }
//
//
//        if (x > 625 && x < 726 && y > 625 && y < 726){
//
//        }

    }



    public void moveLeft() {
        x = x - WIDTH;

//        if(x > 125 && x < 226 && y > 125 && y < 226) {
//            x = 325;
//        }
//
//        if(x > 125 && x < 226 && y > 225 && y < 326){
//            x = 325;
//        }

        repaint();


    }

    public void moveDown() {
        y = y + HEIGHT;

//        if(x > 125 && x < 226 && y > 125 && y < 226) {
//            x = 225;
//            y = 125;
//        }
        repaint();
    }

    public void moveUp() {
        y = y - HEIGHT;
//
//        if(x > 125 && x < 226 && y > 125 && y < 226) {
//            x = 225;
//            y = 325;
//        }
//
//        if(x > 125 && x < 226 && y > 225 && y < 350){
//            x = 225;
//            y = 425;
//        }
        repaint();
    }
}