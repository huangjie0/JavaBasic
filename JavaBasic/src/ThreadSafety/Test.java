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
    }
}
