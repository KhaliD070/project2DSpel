package com.khalidhajjari;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class GameRun extends JFrame {


    public static void main(String[] args) {

//        JFrame frame = new JFrame();
//        frame.setSize(1020, 1100);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setTitle("2Dspel");
//        frame.setVisible(true);

        Karakter frame = new Karakter();
        frame.setResizable(true);
        frame.setTitle("2D spel van Khalid");
        frame.setSize(1000, 1000);
        frame.setMinimumSize(new Dimension(1020, 1100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(frame.karakter);
        frame.pack();
        frame.setVisible(true);


        JComponent component = new LeegVak();
        frame.add(component);
        frame.setVisible(true);

        JComponent barricade = new onbreekbaarBarricade();
        frame.add(barricade);
        frame.setVisible(true);

        JComponent sleutel = new SleutelVak();
        frame.add(sleutel);
        frame.setVisible(true);

        JComponent breekbarebarricade = new breekbareBarricade();
        frame.add(breekbarebarricade);
        frame.setVisible(true);



    }
}