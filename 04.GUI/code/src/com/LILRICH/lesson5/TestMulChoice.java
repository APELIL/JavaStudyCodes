package com.LILRICH.lesson5;

import javax.swing.*;
import java.awt.*;

public class TestMulChoice {
    public static void main(String[] args) {
        new MulChoice();
    }
}

class MulChoice extends JFrame{
    public MulChoice() {
        //layout
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        //button
        JCheckBox jButton1 = new JCheckBox("Test1");
        JCheckBox jButton2 = new JCheckBox("Test2");
        JCheckBox jButton3 = new JCheckBox("Test3");

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
