package StringDemo;
/*
* java中api的String类
* */

public class StringDemo {
    public static void main(String[] args) {
        //string 1、直接创建
        String s = "hello";
        System.out.println(s);

        //2、new String并调用构造器创建，不推荐
        String se = new String("hello1");
        System.out.println(se);
        //字符数组
        char[] c = { 'a','你','2'};
        String dsdfe = new String(c);
        System.out.println(dsdfe);
        //将字节转为string
        byte[]  bytes = {97,98,99};
        String ee = new String(bytes);
        System.out.println(ee);
    }
}
