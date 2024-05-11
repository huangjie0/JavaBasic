package Recursion;
/**
 * 方法递归
 * */

public class Test {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        System.out.println(111);
        test1();
    }
    public static void test2(){
        System.out.println("---test2---");
        test3();
    }
    public static void test3(){
        test2();
    }
}
