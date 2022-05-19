package com.LILRICH.lesson4;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JFIcon extends JFrame {
    public JFIcon(){
        JLabel test = new JLabel("TEST");
//        URL url = JFIcon.class.getResource("1.jpg");
        URL url = JFIcon.class.getResource("WX20220422-020648.png");
        URL resource = JFIcon.class.getResource("1.jpg");
//        ImageIcon icon = new ImageIcon("/Users/yanglimin/iCloud Drive (Archive)/Documents/JAVA/04.GUI/code/src/com/LILRICH/lesson4/WX20220422-020648.png");
        System.out.println(url);
        ImageIcon ic = new ImageIcon(JFIcon.class.getResource("WX20220422-020648.png"));
        test.setIcon(ic);
        test.setHorizontalAlignment(SwingConstants.CENTER);

        Container ContainerIcon = getContentPane();
        ContainerIcon.add(test);

        setBounds(100,100,200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JFIcon();

    }


}
