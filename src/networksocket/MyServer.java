package networksocket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args)  {
        try {
            ServerSocket ss = new ServerSocket(786);
            
            System.out.println("Connecting");
            Socket Hamza = ss.accept();  
            System.out.println(" Connected");
            
            DataInputStream dis = new DataInputStream(Hamza.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            
            ss.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
