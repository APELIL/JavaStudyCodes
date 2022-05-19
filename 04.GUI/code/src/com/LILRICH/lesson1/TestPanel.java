package com.LILRICH.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();

        frame.setLayout(null);
        //frame
        frame.setBounds(200,200,500,500);
        frame.setBackground(new Color(40,161,35));

        //panel
        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(172, 130, 24, 255));

        //add panel
        frame.add(panel);
        frame.setVisible(true);

        //close the window

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
}
