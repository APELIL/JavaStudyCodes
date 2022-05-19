package com.LILRICH.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listener02 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("B1");
        Button button2 = new Button("B2");

        Listener myListener = new Listener();
        button1.addActionListener(myListener);
//        button1.setActionCommand("xx");
        button2.addActionListener(myListener);

        frame.setLayout(new BorderLayout());
        frame.add(button1,BorderLayout.WEST);
        frame.add(button2,BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
    }
}
class Listener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
