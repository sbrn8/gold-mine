import  java.awt.*;

public class background {
    
    Image bg = Toolkit.getDefaultToolkit().getImage("images/soil-bg.png");
    Image bg1 = Toolkit.getDefaultToolkit().getImage("images/sky.jpg");
    Image cart = Toolkit.getDefaultToolkit().getImage("images/cart1.png");

    void paintSelf (Graphics g){
        g.drawImage(bg1, 0, 0, null); //sky
        g.drawImage(bg, 0, 358, null); //soil
        g.drawImage(cart, 370, 265, null); //cart
    }
}
