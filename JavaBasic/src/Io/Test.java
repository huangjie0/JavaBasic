package Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        //Io流，i---->input输入读取 输入流和输出流  字节输入流、字节输出流 字符输入流、字符输出流
        //字节输入流 抽象类   inputStream  字节输出流 outputStream  字符输入流 Reader  字符输出流 Writer
        //实现类 FileInputStream FileOutPutStream   FileReader FileWriter
//        InputStream f = new FileInputStream(new File("JavaBasic\\src\\aa.txt"));
        InputStream f = new FileInputStream("src\\aa.txt");
        //开始读取字节数据,每次读取一个字节,返回
//        int b = f.read();
//        System.out.println((char)b);
//        int b2 = f.read();
//        System.out.println((char)b2);
//        int b;
//        while ((b = f.read()) != -1){
//            System.out.println((char)b);
//        }
//        //读取数据性能很差，流使用完毕要释放
//        f.close();

        //一次多次读取文件
//        byte[] buffer = new byte[3];
//        int len = f.read(buffer);
//        String rs = new String(buffer);
//        System.out.println(rs);
//        System.out.println(len);
//
//        int len2 = f.read(buffer);
//        String rs2 = new String(buffer);
//        System.out.println(rs2);
//        System.out.println(len2);

        //使用循环多次读取
        byte[] buffer = new byte[3];
        int len;
        while ((len = f.read(buffer)) !=-1){
            String r = new String(buffer,0,len);
            System.out.println(r);
        }
        //性能明显提升
        f.close();
    }
}
