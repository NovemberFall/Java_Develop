package chatClient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;

public class chatClient3 extends Frame{

    TextField tf = new TextField();
    TextArea ta = new TextArea();

    public static void main(String[] args){
        new chatClient3().launchFrame();
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
        tf.addActionListener(new TextFieldListener());
        setVisible(true);
        connect();
    }


    private class TextFieldListener implements ActionListener{


        /**
         * Invoked when an action occurs.
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tf.getText().trim();
            ta.setText(s);
            tf.setText("");
        }
    }

    public void connect(){
        try {
            Socket s = new Socket("127.0.0.1", 8888);
            System.out.println("Connected!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


























