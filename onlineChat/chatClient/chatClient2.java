package chatClient;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class chatClient2 extends Frame{

    TextField tf = new TextField();
    TextArea ta = new TextArea();

    public static void main(String[] args){
        new chatClient2().launchFrame();
    }

    public void launchFrame(){
        setLocation(400, 300);
        setSize(300, 300);
        add(tf, BorderLayout.SOUTH);
        add(ta, BorderLayout.NORTH);

        pack();   //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        this.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}
