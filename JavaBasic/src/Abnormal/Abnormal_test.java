package Abnormal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
* 抛出异常
* */

public class Abnormal_test {
    public static void main(String[] args) throws ParseException {
//        Integer.valueOf("abc");
        //error,exception异常类
        int[] arr = {11,22,33};
//        System.out.println(arr[4]);
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse("2028-11-11 10:21:23");
//            System.out.println(d);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11 10:21:23");
        System.out.println(d);

        try {
            saveAge(160);
//            。。。。。
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            saveAge2(160);
        } catch (AgeCompileException e) {
            throw new RuntimeException(e);
        }
    }
    //自定义异常 运行时异常
    public static void saveAge(int age){
        if(age > 0 && age < 150){
            System.out.println("年龄被成功保存" + age);
        }else {
            //异常对象封装
//            System.out.println("年龄非法");
            //抛出异常
            throw new AgeIllegality("年龄非法！！你的年龄是" + age);
        }
    }
    public static void saveAge2(int age) throws AgeCompileException{
        if(age > 0 && age < 150){
            System.out.println("年龄被成功保存" + age);
        }else {
            //异常对象封装
//            System.out.println("年龄非法");
            //抛出异常
            throw new AgeIllegality("年龄非法！！你的年龄是" + age);
        }
    }
}
