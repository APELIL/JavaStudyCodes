package com.LILRICH.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //component-button
        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");

        //set flow layout - center, left, right
        frame.setLayout(new FlowLayout()); // default center
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
//        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setSize(200,200);
        frame.setVisible(true);
        //add button
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        /* you can set the layout like this way */
//        frame.add(b1,FlowLayout.RIGHT);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
