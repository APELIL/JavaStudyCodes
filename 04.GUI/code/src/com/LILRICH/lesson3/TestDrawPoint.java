package com.LILRICH.lesson3;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestDrawPoint {
    public static void main(String[] args) {
        new PointFrame().load();
    }
}

class PointFrame extends Frame{
    // 1. attributes
    ArrayList points;
    // 2. load
    public void load(){
        points = new ArrayList<>();
        addMouseListener(new MyMouseListener());
        setSize(200,200);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){

            Point point =(Point) iterator.next();
            g.setColor(Color.cyan);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            PointFrame pointframe=(PointFrame) e.getSource();
            points.add(new Point(e.getX(),e.getY()));
            System.out.println(points);
            pointframe.repaint();
        }
    }
}


