package com.khalidhajjari;

import javax.swing.*;
import java.awt.*;

public class SleutelVak extends LeegVak {


    public SleutelVak() {
    }

    LeegVak vak = new LeegVak();
    Sleutel s;

    int sleutel1 = vak.MAXX / vak.MAXX * vak.WIDTH * 9;
    int sleutel2 = vak.MAXY / vak.MAXY * vak.HEIGHT * 9;

    int sleutel3 = vak.MAXX / vak.MAXX * vak.WIDTH * 5;
    int sleutel4 = vak.MAXY / vak.MAXY * vak.HEIGHT * 5;

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;

        g2.setColor(Color.black);
        g2.fillRect(sleutel1,sleutel2,vak.WIDTH,vak.HEIGHT);
        g2.setColor(Color.WHITE);
        g2.drawString("100",400,410);
        System.out.println("100");


        g3.setColor(Color.black);
        g3.fillRect(sleutel3,sleutel4,vak.WIDTH,vak.HEIGHT);
        g3.setColor(Color.WHITE);
        g3.drawString("300",500,710);
        System.out.println("100");

    }



}
