package chatII;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class chatServer {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(8888);
            while(true){
                Socket socket = ss.accept();
                System.out.println("A client connected!");
                DataInputStream input = new DataInputStream(socket.getInputStream());
                String s = input.readUTF();
                System.out.println(s);
                input.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
