package Rewrite;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.print1();
        b.print2(1,2);

        System.out.println("-------------------------");
        Student s = new Student("黄杰",28);
        //地址对象
//        System.out.println(s.toString());

        System.out.println(s);
        ArrayList list = new ArrayList<>();
        list.add("java");
        System.out.println(list);
    }
}
