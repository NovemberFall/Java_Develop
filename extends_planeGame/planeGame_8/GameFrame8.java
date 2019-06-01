package planeGame_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * This planeGame_8 can create a primary frame :
 *  1. setTitle
 *  2. setVisible
 *  3. setSize
 *  4. setLocation
 *  5. May close the primary window : windowClosing() or using this.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
 */

/**
 * The primary frame of game
 */
public class GameFrame8 extends Frame {     // if extends JFrame the screen might flicker, the best way is to extends Frame
    Image planeImage = GameUtil.getImage("./jet2.png");
    Image bg = GameUtil.getImage("./wbg.jpg");

    Plane plane = new Plane(planeImage, 250, 250);
    Shell[] shells = new Shell[20];

    @Override
    public void paint(Graphics g){ //they are invoked automatically
        g.drawImage(bg,0,0,null);

        plane.drawSelf(g);
        for(int i=0; i<shells.length; i++){
            shells[i].draw(g);

            boolean crash = shells[i].getRect().intersects(plane.getRect());
            if(crash){
                System.out.println("Collide...");
                plane.alive = false;
            }
        }
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

    //define keyboard monitor inner class
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e){
            plane.minusDirection(e);
        }
    }

    /**
     * initialize the frame
     */
    public void launchFrame(){
        this.setTitle("My Plane Game");
        this.setVisible(true);
        this.setSize(Constant.GAME_WIDTH, Constant.GAME_WIDTH);
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
        new PaintThread().start();   //run the repaint() method's thread
        this.addKeyListener(new KeyMonitor());

        //initialize 50 shells
        for(int i=0; i<shells.length; i++){
            shells[i] = new Shell();
        }
    }

    public static void main(String[] args){
        GameFrame8 gf = new GameFrame8();
        gf.launchFrame();
    }

    // in the older version java, you should add this method to prevent screen flickering
/*    private Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }*/
}
