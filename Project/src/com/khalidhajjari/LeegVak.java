package com.khalidhajjari;

import java.awt.*;

public class LeegVak extends Vak {

    int HEIGHT = 100;
    int WIDTH = 100;

    int MAXX = 1000;
    int MAXY = 1000;

    public LeegVak() {
    }


    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < MAXX; i += WIDTH) {
            for (int j = 0; j < MAXY; j += HEIGHT) {
                g2.drawRect(i, j, WIDTH, HEIGHT);
            }
        }
    }

    public void getComponent(){
    }


}
