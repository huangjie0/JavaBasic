package NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 客户端
 * */

public class Client {
    public static void main(String[] args) throws Exception {
        //创建客户端对象
        DatagramSocket socket = new DatagramSocket();
        //创建数据包对象发出去的数据
        //发出去的数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();
            //一旦用户输入的是exit命令，用户退出程序
            if("exit".equals(msg)){
                System.out.println("欢迎下次光临，退出成功！");
                socket.close();
                break; //跳出死循环
            }

            byte[] bytes = msg.getBytes();

            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,InetAddress.getLocalHost(),6666);

            //开始正式发送
            socket.send(packet);
        }
    }
}
