package com.LILRICH.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalOOP {
    public static void main(String[] args) {
        new OopFrame().loadFrame();
    }
}

//Frame
class OopFrame extends Frame{
    //1. attribute
    TextField num1, num2, num3;
    //2. method
    public void loadFrame(){
        //1. TextField
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        //2. Label
        Label label = new Label("+");
        //3. Button & action listener
        Button button = new Button("=");
        OopListener oopListener = new OopListener(this);
        button.addActionListener(oopListener);
        //Layout - Flowlayout
        setLayout(new FlowLayout());

        //add
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        //Set it to visible
        pack();
        setVisible(true);
    }
}
//Listener
class OopListener implements ActionListener{
    //   get object
    OopFrame oopFrame = null;
    public OopListener(OopFrame oopFrame){
     this.oopFrame = oopFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. get num1, num2, num3
        // 2. put num3 into third block
        // 3. delete num1 and num2
        int n1 = Integer.parseInt(oopFrame.num1.getText());
        int n2 = Integer.parseInt(oopFrame.num2.getText());
        oopFrame.num3.setText(""+(n1+2));
    }
}