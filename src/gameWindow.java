/**
 * gameWindow
 */
import javax.swing.*;
import java.awt.*;

public class gameWindow extends JFrame {

    background bg = new background();
    void launch (){
        this. setVisible(true);
        this.setSize(905, 1019);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Gold Mine");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint (Graphics g){
        bg.paintSelf(g);
    }
    
    public static void main(String[] args) {
        gameWindow GameWindow = new gameWindow();
        GameWindow.launch();
    }
}