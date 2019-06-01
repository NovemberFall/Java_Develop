package planeGame_3;

import javax.swing.*;
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
public class GameFrame3 extends JFrame {
    Image plane = GameUtil.getImage("./plane.png");
    Image bg = GameUtil.getImage("./bg.jpg");

    int planeX = 250, planeY=250;
    @Override
    public void paint(Graphics g){ //they are invoked automatically
        g.drawImage(bg,0,0,null);
        g.drawImage(plane, planeX, planeY,null);
        planeX++;
    }

    //help implement repaint
    class PaintThread extends Thread{
        @Override
        public void run(){
            while(true){
                //System.out.println("Repaint...");
                repaint();

                try {
                    Thread.sleep(40);       //1s=1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * initialize the frame
     */
    public void launchFrame(){
        this.setTitle("My Plane Game");
        this.setVisible(true);
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
        new PaintThread().start();
    }

    public static void main(String[] args){
        GameFrame3 gf = new GameFrame3();
        gf.launchFrame();
    }
}
