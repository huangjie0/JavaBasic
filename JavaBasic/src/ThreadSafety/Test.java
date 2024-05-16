package ThreadSafety;
/**
 * 线程安全问题
 * */

public class Test {
    public static void main(String[] args) {
        Account a1 = new Account(100000,"sdf123213c");
        //创建俩个线程代表小明和小红
        new DrawThead(a1,"小明").start(); //小明
        new DrawThead(a1,"小红").start(); //小红

        Account a2 = new Account(100000,"ssdfds13c");
        //创建俩个线程代表小明和小红
        new DrawThead(a2,"小黑").start(); //小黑
        new DrawThead(a2,"小白").start(); //小白
    }
}
