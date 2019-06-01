package planeGame_8;

import java.awt.*;

public class Shell extends GameObject{

    double degree;

    public Shell(){
        x = 200;
        y = 200;
        width = 10;
        height = 10;
        speed = 4;

        degree = Math.random()*Math.PI*2;   //Math.random()   0-1

    }

    public void draw(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.BLACK);

        g.fillOval((int)x, (int)y, (int)width, (int)height);

        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);

        if(x<0 || x> Constant.GAME_WIDTH - width){
            degree = Math.PI - degree;
        }

        if(y<30 || y> Constant.GAME_HEIGHT - height){
            degree = - degree;
        }

        g.setColor(c);
    }
}
