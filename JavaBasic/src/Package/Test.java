package Package;
/*
* 导包操作
* */
import Package.Demo.Demo;
import Package.Demo1.Demo2;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.print();
        Demo d2 = new Demo();
        d2.print();
        Scanner sr = new Scanner(System.in);
        String s2 = "呼呼";
        Random r = new Random();
        Demo2 d4 = new Demo2();
        d4.print();
        Demo2 dk = new Demo2();
        dk.print();
    }
}
