package Abnormal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            test1();
        } catch (Exception e) {
            System.out.println("您当前操作有问题！");
            throw new RuntimeException(e); //打印这个异常对象信息
        }
    }
    public static void test1() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-12-11 10:12:10");
        System.out.println(d);
        test2();
    }
    public static void test2() throws Exception {
        //读取文件
        FileInputStream is = new FileInputStream("D:/meinv.png");
    }
}
