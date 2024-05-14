package DataStream;
/*
* 数据输入流
* */

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test2 {
    public static void main(String[] args) {
        //使用数据输入流读取特定的数据
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src/ln.txt"))){
            int i = dis.readInt();
            System.out.println(i);
            Double d = dis.readDouble();
            System.out.println(d);
            Boolean b = dis.readBoolean();
            System.out.println(b);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
