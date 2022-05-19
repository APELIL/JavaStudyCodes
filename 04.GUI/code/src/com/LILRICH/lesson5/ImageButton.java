package com.LILRICH.lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageButton {
    public static void main(String[] args) {
    new TestImageButton();
    }
}

class TestImageButton extends JFrame{
    public TestImageButton() {
        //layout
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        //button
        JButton jButton = new JButton("Test");
        //image
        ImageIcon icon = new ImageIcon(TestImageButton.class.getResource("ButtonDemo.png"));
        //image to button
        jButton.setIcon(icon);
        //tip
        jButton.setToolTipText("Tip");
        //button to frame
        container.add(jButton,BorderLayout.CENTER);
        //set Visible
        setSize(200,300);
        setVisible(true);
        //close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}