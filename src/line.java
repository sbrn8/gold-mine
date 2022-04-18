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

    //state
    //0 moving left to right, 1 grab, 2 pull
    int state;

    void lines (Graphics g){
        endx = (int) (x + length*Math.cos(a*Math.PI));
        endy = (int) (y + length*Math.sin(a*Math.PI));
        g.setColor(Color.black);
        g.drawLine(x, y, endx, endy);
    }

    void paintSelf(Graphics g){

        switch(state){
            case 0: 
                if (a<0.1) {
                    direction = 1;}
                else if (a>0.9){
                    direction = -1;}
                a = a + 0.005*direction;
                lines(g);                
                break;
            
            case 1:
            if (length<500){
                length = length + 10;
                lines(g);
            } else {state=0;}
            
            case 2:
                if (length>100){
                    length = length - 10;
                    lines(g);
                } else {
                    state = 0;
                }
            
                break;
            default:     
        }                 
    }
}
