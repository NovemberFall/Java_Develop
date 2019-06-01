package planeGame_1;

import javax.swing.JFrame;
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
public class GameFrame extends JFrame {

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
    }

    public static void main(String[] args){
        GameFrame gf = new GameFrame();
        gf.launchFrame();
    }
}
