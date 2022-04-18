import java.awt.*;
public class line {

    //starting position
    int x =470;
    int y =358;

    //ending position
    int endx =500;
    int endy =500;

    void paintSelf(Graphics g){
        g.setColor(Color.red);
        g.drawLine(x, y, endx, endy);
    }
}
