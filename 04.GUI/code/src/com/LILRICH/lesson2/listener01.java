package com.LILRICH.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class listener01 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button("姨妈痛");
        Listener mylistener = new Listener();
        button.addActionListener(mylistener);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
        cl(frame);
    }
    private static void cl(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("溜冰颜加油");
    }
}