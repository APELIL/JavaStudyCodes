package com.LILRICH.lesson3;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyboard {
    public static void main(String[] args) {
    new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame() {
        setSize(200,200);
        setVisible(true);
        //inner class
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //get keycode
                int KeyCode = e.getKeyCode();
                if(KeyCode == KeyEvent.VK_UP){
                    System.out.println("You pressed Up");
                }
            }
        });
    }
}
