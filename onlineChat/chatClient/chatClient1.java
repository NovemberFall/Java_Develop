package chatClient;


import javax.swing.*;
import java.awt.*;

public class chatClient1 extends Frame{

    TextField tf = new TextField();
    TextArea ta = new TextArea();

    public static void main(String[] args){
        new chatClient1().launchFrame();
    }

    public void launchFrame(){
        setLocation(400, 300);
        setSize(300, 300);
        add(tf, BorderLayout.SOUTH);
        add(ta, BorderLayout.NORTH);
        setVisible(true);
        pack();   //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
    }
}
