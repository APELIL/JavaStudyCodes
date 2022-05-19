package com.LILRICH.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalInClass {
    public static void main(String[] args) {
        new InCal().loadCal();
    }
}
class InCal extends Frame{
    //1.Attributes
    TextField num1, num2, num3;

    //2.Method
    public void loadCal(){
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        Label label = new Label("+");
        Button button = new Button("=");
        //Listener
        InListener inListener = new InListener();
        button.addActionListener(inListener);
        cl(this);//close the window
        //set layout
        setLayout(new FlowLayout());

        //add
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        //set it to visible
        pack();
        setVisible(true);
    }
    //method to close window
    public void cl(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
        });
    }
    private class InListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText(""+(n1+n2));
        }
    }
}
