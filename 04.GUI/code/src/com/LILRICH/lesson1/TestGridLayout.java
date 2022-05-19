package com.LILRICH.lesson1;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2,2));
        for (int i = 0; i < 4; i++) {
            frame.add(new Button("Button"+(i+1)));
        }
        frame.setSize(200,200);
        frame.setVisible(true);

    }
}
