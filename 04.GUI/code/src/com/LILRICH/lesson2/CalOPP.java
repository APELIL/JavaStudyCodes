package com.LILRICH.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalOPP {
    public static void main(String[] args) {
        new OppFrame();
    }
}

//Frame
class OppFrame extends Frame{
    public OppFrame() {
        //1. TextField
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        //2. Label
        Label label = new Label("+");

        //3. Button & action listener
        Button button = new Button("=");
        OppListener oppListener = new OppListener(num1, num2, num3);
        button.addActionListener(oppListener);
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
class OppListener implements ActionListener{
//    pass num1,2,3 from another class
    private TextField num1, num2, num3;
    public OppListener(TextField num1, TextField num2, TextField num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. get num1, num2, num3
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        // 2. put num3 into third block
        num3.setText(""+(n1+n2));
        // 3. delete num1 and num2
        num1.setText("");
        num2.setText("");
    }
}