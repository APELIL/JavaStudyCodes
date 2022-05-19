package com.LILRICH.lesson1;

import java.awt.*;

public class Frame01 {
    public static void main(String[] args) {
        Frame frame = new Frame("First GUI");
        //set window size
        frame.setSize(400,400);

        //location of window
        frame.setLocation(200,200);

        //background color
        frame.setBackground(new Color(80,150,70));

        //make window un-resizeable
        frame.setResizable(false);

        //make window visible
        frame.setVisible(true);
    }
}
