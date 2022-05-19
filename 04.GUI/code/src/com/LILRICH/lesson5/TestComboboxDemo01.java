package com.LILRICH.lesson5;

import javax.swing.*;
import javax.swing.text.ComponentView;
import java.awt.*;

public class TestComboboxDemo01 {
    public static void main(String[] args) {
    new Combobox();
    }
}

class Combobox extends JFrame{
    public Combobox() {
        //container
        Container container = getContentPane();

        //size&visible
        setSize(200,200);
        setVisible(true);

        //close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //combobox
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("Popular");
        jComboBox.addItem("Best sellers");
        jComboBox.addItem("NA");

        //combobox to container
        container.add(jComboBox);

    }
}
