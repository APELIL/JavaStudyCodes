package com.LILRICH.lesson5;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestComboboxDemo02 {
    public static void main(String[] args) {
    new ComboboxDemo02();
    }
}
class ComboboxDemo02 extends JFrame{
    public ComboboxDemo02(){
        //container
        Container container = getContentPane();

        //size&visible
        setSize(200,200);
        setVisible(true);

        //close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //method1 static list
        String[] temp = {"A","B","C"};
//        JList jList = new JList(temp);
//        container.add(jList);

        //method2 dynamic list
        Vector vector = new Vector();
        JList jList = new JList(vector);
        vector.add("A");
        vector.add("B");
        vector.add("C");

        container.add(jList);
    }

}