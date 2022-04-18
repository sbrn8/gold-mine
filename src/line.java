import java.awt.*;

/**
 * Find the position of the ending point of the line through trig
 * because it will be a right triangle
 * a = angle
 * endx = x + length*cos a
 * endy = y + length*sin a 
 */

public class line {

    //starting position
    int x =470;
    int y =358;

    //ending position
    int endx =500;
    int endy =500;

    //length
    double length = 100;
    double a = 0;

    //direction
    int direction = 1;

    void paintSelf(Graphics g){
        if (a<0.1) {
            direction = 1;}
        else if (a>0.9){
            direction = -1;}

        a = a + 0.005*direction;
        endx = (int) (x + length*Math.cos(a*Math.PI));
        endy = (int) (y + length*Math.sin(a*Math.PI));

        g.setColor(Color.black);
        g.drawLine(x, y, endx, endy);
    }
}
