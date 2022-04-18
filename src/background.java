import  java.awt.*;

public class background {
    
    Image bg = Toolkit.getDefaultToolkit().getImage("images/soil-bg.png");
   

    void paintSelf (Graphics g){
        g.drawImage(bg, 0, 0, null);
    }
}
