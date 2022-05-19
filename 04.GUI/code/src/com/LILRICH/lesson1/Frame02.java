package com.LILRICH.lesson1;
import java.awt.*;

public class Frame02 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100,100,200,200,Color.yellow);
        MyFrame myFrame2 = new MyFrame(300,100,200,200,Color.gray);
    }
}
class MyFrame extends Frame{
    static int id = 0;
    public MyFrame(int x, int y, int w, int d, Color color){
        super("+ window"+(++id));
        setBackground(color);
        setBounds(x,y,w,d);
        setVisible(true);
    }

}