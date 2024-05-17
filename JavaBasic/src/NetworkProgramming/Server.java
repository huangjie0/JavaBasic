package NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("------服务端启动--------");
        //创建一个服务端对象
        DatagramSocket socket = new DatagramSocket(6666);

        //创建数据包对象用来接受数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

        while (true) {
            //开始正式接受发来的数据
            socket.receive(packet);
            //从字节里面打印出来
            //获取本次数据包接受多少数据
            int len = packet.getLength();

            String rs = new String(buffer,0,len);
            System.out.println(rs);

            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
            System.out.println("--------------------------------------");
        }
    }
}
