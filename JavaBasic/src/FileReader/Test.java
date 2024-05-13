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
            int c; //记住每次读取的字符编号
            while ((c = r.read()) != -1){
                System.out.println((char)c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
