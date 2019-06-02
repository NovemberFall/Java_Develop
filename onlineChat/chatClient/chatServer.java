package chatClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class chatServer {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(8888);
            while(true){
                Socket s = ss.accept();
                System.out.println("A client connected!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
