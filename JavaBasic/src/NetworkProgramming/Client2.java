package NetworkProgramming;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 一发一收 TCP通信
 * */
public class Client2 {
    public static void main(String[] args) throws Exception {
        // 创建对象
        Socket s = new Socket("127.0.0.1",8888);
        // 从管道中得到字节输出流
        OutputStream os = s.getOutputStream();

        //将低级包装输出流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说！");
            String msg = sc.nextLine();

            if("quit".equals(msg)){
                System.out.println("欢迎下次光临！");
                dos.close();
                s.close();
                break;
            }

            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
