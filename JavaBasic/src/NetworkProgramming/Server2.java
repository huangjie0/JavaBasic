package NetworkProgramming;

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
            //将客户端通信管道交给独立的线程进行管理
            new MyThread(s).start();
        }
    }
}
