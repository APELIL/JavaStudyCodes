package com.LILRICH.snake;

import org.omg.DynamicAny.DynArray;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener {
    /*
    * 1.attributes
    * the length of snake
    * the initialized position of snake
    * */
    int length;
    int[] snakeX = new int[600];
    int[] snakeY = new int[600];
    String headDir;
    boolean status = false;
    boolean isfail = false;
    Timer timer = new Timer(100, this);//perform/100ms

    //food coordinate
    int foodx;
    int foody;
    Random random = new Random();

    //score
    int score;

    //constructor
    public GamePanel(){
        init();
        //keyboard setting
        this.setFocusable(true);//get focus event
        this.addKeyListener(this);
        timer.start();
        foodx = 25 + 25*random.nextInt(34);
        foody = 75+ 25*random.nextInt(24);

    }
    public void init(){
        length = 3;
        snakeX[0] = 100; snakeY[0] = 100; // position of head
        snakeX[1] = 75; snakeY[1] = 100; // position of body1
        snakeX[2] = 50; snakeY[2] = 100; // position of body2
        headDir = "R";
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//clear screen, flash otherwise
        this.setBackground(Color.white);
//        Data.header.paintIcon(this,g,25,11);
        g.fillRect(25,11,850,50);
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.BOLD,40));
        g.drawString("Snake!!!",400,50);
        g.setColor(Color.gray);
        g.fillRect(25,75,850,600);//game interface

        /*draw snake*/
        //draw head
        if (headDir.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        } else if (headDir.equals("L")){Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        } else if (headDir.equals("U")){Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        } else if (headDir.equals("D")){Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);}

        //draw body
        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }
        //draw food
        Data.food.paintIcon(this,g,foodx,foody);
        /*game status->*/
        //pause
        if (status==false){
            g.setColor(Color.white);
            g.setFont(new Font("Arial",Font.BOLD,40));
            g.drawString("Resume",350,400);
        }
        //fail
        if (isfail){
            g.setColor(Color.red);
            g.setFont(new Font("Arial",Font.BOLD,40));
            g.drawString("You failed, press space to restart",150,400);
        }
        /*draw score*/
        g.setColor(Color.white);
        g.setFont(new Font("Arial",Font.ITALIC,20));
        g.drawString("Score"+score,700,30);
        g.drawString("length"+length,700,50);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE){//resume or restart
            if (isfail){
                isfail = false;
                init();
            }else{status = !status;}
            repaint();//repaint after resetting status
        }
        else if(keyCode == KeyEvent.VK_UP){
            headDir = "U";
        }else if(keyCode == KeyEvent.VK_DOWN){
            headDir = "D";
        }else if(keyCode == KeyEvent.VK_LEFT){
            headDir = "L";
        }else if(keyCode == KeyEvent.VK_RIGHT){
            headDir = "R";
        }
        timer.start();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //snakeX: 100, 75, 50 -> 125, 100, 75 -> 150, 125, 100 (left to right)
        if (status && isfail == false){
            if (snakeX[0]==foodx && snakeY[0]==foody){
                length++;
                score += 10;
                foodx = 25 + 25*random.nextInt(34);
                foody = 75 + 25*random.nextInt(24);
            }
            for (int i = length-1; i > 0 ; i --) {
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }
            if (headDir.equals("R")){
                snakeX[0] = snakeX[0] + 25;
                if (snakeX[0]>850){
                    snakeX[0] = 25;
                }
            }else if (headDir.equals("L")){
                snakeX[0] = snakeX[0] -25;
                if (snakeX[0]<25){
                    snakeX[0] = 850;
                }
            }else if (headDir.equals("U")){
                snakeY[0] = snakeY[0] - 25;
                if (snakeY[0]<75){
                    snakeX[0] = 650;
                }
            }
            else if (headDir.equals("D")){
                snakeY[0] = snakeY[0] + 25;
                if (snakeY[0]>650){
                    snakeY[0] = 75;
                }
            }
            //to judge fail or not
            for (int i = 1; i < length; i++) {
                if (snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i]){ //head hit body
                    isfail = true;
                    score = 0;
                }
            }
            repaint();
        }
    }
}