package DataStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
* 数据流
* */
public class Test {
    public static void main(String[] args) {
        //创建一个数据输出流包装低级的字节输出流
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/ln.txt"));){
            dos.writeInt(97);
            dos.writeDouble(87.9);
            dos.writeBoolean(false);
            dos.writeUTF("黑马程序员");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
