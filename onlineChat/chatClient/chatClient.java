package chatClient;

import java.awt.*;

public class chatClient extends Frame {

    public static void main(String[] args){
        new chatClient().launchFrame();
    }

    public void launchFrame(){
        setLocation(400, 300);
        setSize(300, 300);
        setVisible(true);
    }
}
