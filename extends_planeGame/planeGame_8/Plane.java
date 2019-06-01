package planeGame_8;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
    private boolean left, up, right, down;

    protected boolean alive = true;

    @Override
    public void drawSelf(Graphics g){

        if(alive){
            g.drawImage(img, (int)x, (int)y, null);
            if(left){
                x -= speed;
            }
            if(right){
                x += speed;
            }

            if(up){
                y -= speed;
            }
            if(down){
                y += speed;
            }
        }else{

        }
    }

    public Plane(Image img, double x, double y){
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = 3;
        this.width = img.getWidth(null);        //or this.width = 40;
        this.height = img.getHeight(null);      //or this.height = 40;
    }

    //Press some keys, add correspond direction
    public void addDirection(KeyEvent e){
        //System.out.println("++++"+e.getKeyCode());
        switch (e.getKeyCode()){
            case 37:         // keyEvent.VK_LEFT
                left = true;
                break;

            case 38:         // keyEvent.VK_UP
                up = true;
                break;

            case 39:         // keyEvent.VK_RIGHT
                right = true;
                break;

            case 40:        // keyEvent.VK_DOWN
                down = true;
                break;
        }
    }

    //Press some keys, minus correspond direction
    public void minusDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case 37:         // keyEvent.VK_LEFT
                left = false;
                break;

            case 38:         // keyEvent.VK_UP
                up = false;
                break;

            case 39:         // keyEvent.VK_RIGHT
                right = false;
                break;

            case 40:        // keyEvent.VK_DOWN
                down = false;
                break;
        }
    }
}
