package TCP;

import com.sun.jmx.snmp.SnmpNull;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        //1. when you want to send something, you need to know IP and Port
        try {
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            //2. create a socket connection
            socket = new Socket(serverIP, port);
            //3.send message I/O flow (output)
            os = socket.getOutputStream();
            os.write("Hi there!".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!= null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
