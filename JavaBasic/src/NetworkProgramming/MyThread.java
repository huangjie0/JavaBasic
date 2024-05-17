package NetworkProgramming;

import java.io.InputStream;
import java.net.Socket;
import java.io.DataInputStream;

public class MyThread extends Thread{
    private Socket s;
    @Override
    public void run(){
        try {
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String rs = dis.readUTF();
                    System.out.println(rs);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public MyThread(Socket s){
        this.s = s;
    }
}
