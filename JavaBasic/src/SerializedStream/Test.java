package SerializedStream;
/*
* 序列化流
* */

import java.io.*;

public class Test {
    public static void main(String[] args) {
        //序列化，将java写入文件
        //创建一个对象字节输出流包装原始字节输出流
        try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/ln.txt"));) {
            Student s1 = new Student("黄杰",19,"123456");
            oos.writeObject(s1);
            System.out.println("序列化成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //反序列化，将文件中java文件对象读出来
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/ln.txt"));){
            Student s = (Student)ois.readObject();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
