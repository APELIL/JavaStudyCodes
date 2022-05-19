package com.LILRICH.lesson5;

import javax.swing.*;
import java.awt.*;

public class TestJpa {
    public static void main(String[] args) {
    new MyJpa();
    }
}

class MyJpa extends JFrame{
    public MyJpa(){
        //JFrame
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,1));
        //panel
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");

        JPanel jPanel = new JPanel(new GridLayout(1,2));
        jPanel.add(b1);
        jPanel.add(b2);

        //Panel to container
        container.add(jPanel);
        setSize(300,300);
        setVisible(true);

        //close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }
}
