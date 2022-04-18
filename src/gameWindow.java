/**
 * gameWindow
 */

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.*;

public class gameWindow extends JFrame {

    background bg = new background();
    line Line = new line();
    void launch (){
        this.setVisible(true);
        this.setSize(905, 1019);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Gold Mine");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.addMouseListener(new MouseAdapter () {
            @Override
            public void mousePressed(MouseEvent e){
               
                mousePressed(e);
                if(e.getButton()==MouseEvent.BUTTON1){
                Line.state = 1;}               
        }});

        while (true){
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint (Graphics g){
        bg.paintSelf(g);
        Line.paintSelf(g);
    }
    
    public static void main(String[] args) {
        gameWindow GameWindow = new gameWindow();
        GameWindow.launch();
    }
}