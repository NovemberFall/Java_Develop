package planeGame_6;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * The super class of game object
 */
public class GameObject {
    protected Image img;
    protected double x,y;
    protected int speed;
    protected double width,height;

    public void drawSelf(Graphics g){
        g.drawImage(img, (int)x, (int)y, null);
    }

    public GameObject(Image img, double x, double y, int speed, int width, int height) {
        //super();
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public GameObject(){

    }

//    public Rectangle getRect(){
//        return new Rectangle((int)x, (int)y, width,height);
//    }

    public Rectangle2D getRect(){
        return new Rectangle2D.Double (x,  y, width, height);
    }
}
