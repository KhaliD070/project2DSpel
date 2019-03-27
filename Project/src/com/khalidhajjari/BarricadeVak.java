package com.khalidhajjari;

import sun.awt.image.ToolkitImage;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.net.URL;

public class BarricadeVak extends Vak {
    public BarricadeVak(){
    }
}


class onbreekbaarBarricade extends JComponent {
    LeegVak vak = new LeegVak();

    int barricade1 = vak.MAXX / vak.MAXX * vak.WIDTH * 1;
    int barricade2 = vak.MAXY / vak.MAXY * vak.HEIGHT *1;

    int barricade3 = vak.MAXX / vak.MAXX * vak.WIDTH * 7;
    int barricade4 = vak.MAXY / vak.MAXY * vak.HEIGHT * 7;


    public void paint(Graphics g) {
        Graphics g2 = g;

        g.fillRect(barricade1,barricade2,vak.WIDTH,vak.HEIGHT);
        g.fillRect(barricade3,barricade4,vak.WIDTH,vak.HEIGHT);

    }
}

class breekbareBarricade extends JComponent{

    public int barricadeWaarde;
    LeegVak vak = new LeegVak();
    Sleutel s = new Sleutel();

    int barricade1x = vak.MAXY / vak.MAXY * vak.HEIGHT * 2;
    int barricade1y = vak.MAXX / vak.MAXX * vak.WIDTH * 2;

    int barricade2x = vak.MAXX / vak.MAXY * vak.WIDTH * 4;
    int barricade3y = vak.MAXY / vak.MAXY * vak.HEIGHT * 4;

    public void paint(Graphics g) {
        Graphics g2 = g;

        Graphics g3 = g;

        g2.setColor(Color.RED);
        g2.fillRect(barricade1x,barricade1y,vak.WIDTH,vak.HEIGHT);
        g2.setColor(Color.WHITE);
        g2.drawString("100",600,610);

        g3.setColor(Color.BLUE);
        g3.fillRect(barricade2x,barricade3y,vak.WIDTH,vak.HEIGHT);
        g3.setColor(Color.WHITE);
        g3.drawString("300",700,710);

    }

    public int getBarricadeWaarde() {
        return barricadeWaarde;
    }

    public void setBarricadeWaarde(int barricadeWaarde) {
        this.barricadeWaarde = barricadeWaarde;
    }


    public boolean toegangBarricade(int x, int y){

        if(x >= (barricade1x-vak.WIDTH) && x <= (barricade1x+vak.WIDTH+1) && y >= (barricade1y) && y < (barricade1y+(vak.WIDTH-1))) {
            return false;
        }
            return true;

        }
    }

