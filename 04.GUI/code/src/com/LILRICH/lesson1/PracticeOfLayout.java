package com.LILRICH.lesson1;

import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PracticeOfLayout {
    public static void main(String[] args) {
        //Frame
        Frame frame = new Frame("Practice");
        frame.setLayout(new GridLayout(2,1));

        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new BorderLayout());
        Panel p3 = new Panel(new GridLayout(2,1));
        Panel p4 = new Panel(new GridLayout(2,2));

        //up
        p1.add(new Button("West1"),BorderLayout.WEST);
        p1.add(new Button("East1"),BorderLayout.EAST);
        p3.add(new Button("B1"));
        p3.add(new Button("B2"));
        p1.add(p3, BorderLayout.CENTER);

        //down
        p2.add(new Button("West2"),BorderLayout.WEST);
        p2.add(new Button("East2"),BorderLayout.EAST);
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("B"+(i+1)));
        }
        p2.add(p4, BorderLayout.CENTER);

        //frame
        frame.setSize(300,300);
        frame.add(p1);
        frame.add(p2);
        frame.setVisible(true);

        //closs window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });




    }
}
