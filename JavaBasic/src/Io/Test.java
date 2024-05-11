package Io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        //Io流，i---->input输入读取 输入流和输出流  字节输入流、字节输出流 字符输入流、字符输出流
        //字节输入流 抽象类   inputStream  字节输出流 outputStream  字符输入流 Reader  字符输出流 Writer
        //实现类 FileInputStream FileOutPutStream   FileReader FileWriter
//        InputStream f = new FileInputStream(new File("JavaBasic\\src\\aa.txt"));
        InputStream f = new FileInputStream("JavaBasic\\src\\aa.txt");

    }
}
