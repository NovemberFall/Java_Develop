package planeGame_2;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * This planeGame_1 can create a primary frame :
 *  1. setTitle
 *  2. setVisible
 *  3. setSize
 *  4. setLocation
 *  5. May close the primary window : windowClosing()
 */

/**
 * The primary frame of game
 */
public class GameFrame2 extends JFrame {
    Image ball = GameUtil.getImage("./ball.png");
    @Override
    public void paint(Graphics g){ //they are invoked automatically

        Color c = g.getColor();
        Font f = g.getFont();

        // Warn: if you directly setColor, you will change the object g's color
        g.setColor(Color.BLUE);

        g.drawLine(100,100,300,300);
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
        g.fillRect(100,100,40,40);

        g.setColor(Color.RED);
        g.setFont(new Font("TimesRoman", Font.BOLD,20));
        g.drawString("Plane",200,200);

        g.drawImage(ball,250,250, null);

        g.setColor(c);
        g.setFont(f);

    }

    /**
     * initialize the frame
     */
    public void launchFrame(){
        this.setTitle("My Plane Game");
        this.setSize(500, 500);
        this.setLocation(800,300);

        this.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                System.exit(0);
            }
        });

        //this.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        GameFrame2 gf = new GameFrame2();
        gf.launchFrame();
    }
}
