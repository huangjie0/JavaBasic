package FileReader;
/*
* 文件字符流
* */

import java.io.FileReader;
import java.io.Reader;

public class Test {
    public static void main(String[] args){
        try (Reader r = new FileReader("E:src\\aa.txt")) {
            //开始读取内容
//            int c; //记住每次读取的字符编号
//            while ((c = r.read()) != -1){
//                System.out.println((char)c);
//            }
            //每次读取多个字符
            char[] buffer= new char[3];
            int len;
            while ((len=r.read(buffer)) != -1){
                System.out.print(new String(buffer, 0, len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
