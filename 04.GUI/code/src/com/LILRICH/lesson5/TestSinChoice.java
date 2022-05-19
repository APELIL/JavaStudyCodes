package com.LILRICH.lesson5;

import javax.swing.*;
import java.awt.*;

public class TestSinChoice {
    public static void main(String[] args) {
        new SinChoice();
    }
}
class SinChoice extends JFrame{
    public SinChoice() {
        //layout
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        //button
        JRadioButton jButton1 = new JRadioButton("Test1");
        JRadioButton jButton2 = new JRadioButton("Test2");
        JRadioButton jButton3 = new JRadioButton("Test3");

        //group, one choice only among a group
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jButton1);
        buttonGroup.add(jButton2);
        buttonGroup.add(jButton3);

        //button to frame
        container.add(jButton1,BorderLayout.NORTH);
        container.add(jButton2,BorderLayout.CENTER);
        container.add(jButton3,BorderLayout.SOUTH);
        //set Visible
        setSize(200,300);
        setVisible(true);
        //close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}