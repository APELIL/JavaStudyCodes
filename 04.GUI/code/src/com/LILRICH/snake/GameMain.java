package com.LILRICH.snake;

import javax.swing.*;

public class GameMain extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10,900,720);
        jFrame.setResizable(false);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //add panel component
        jFrame.add(new GamePanel());

        //setVisible should in the end of code
        jFrame.setVisible(true);

    }
}
