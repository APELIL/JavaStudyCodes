package com.LILRICH.lesson3;

import java.awt.*;

public class TestPaint01 {
    public static void main(String[] args) {
    new TP01().load();
    }
}

class TP01 extends Frame{
    public void load(){
        setSize(200,200);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        // 1. setColor
        g.setColor(Color.red);
        g.drawOval(100,100,100,100);
    }
}
