package NetworkProgramming;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * TCP使用多线程实现通信
 *
 * */

public class Server2 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动成功！");
        //开始服务端
        ServerSocket ss = new ServerSocket(8888);

        while (true) {
            Socket s = ss.accept();
            InputStream is = s.getInputStream();

            DataInputStream dis = new DataInputStream(is);

            while (true) {
                try {
                    String rs = dis.readUTF();
                    System.out.println(rs);
                } catch (Exception e) {
                    System.out.println(s.getRemoteSocketAddress() + "离线了！");
                    s.close();
                    dis.close();
                    break;
                }
            }
        }
    }
}
