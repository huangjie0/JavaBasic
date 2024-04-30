package SetProgression;
/*
* 集合进阶
* collection和map集合
* */

import java.util.ArrayList;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        //Collection集合特点
//        list系列集合：添加的元素有序、可重复、有索引
        ArrayList<String> list = new ArrayList<>(); //有序 可重复 有索引
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        list.add("java1");
        System.out.println(list);
        System.out.println(list.get(1));

        HashSet<String> students = new HashSet<>();  //无序 不重复 无索引
        students.add("黄杰");
        students.add("校长");
        students.add("小明");
        students.add("校长");
        System.out.println(students);
//        System.out.println(students.get());
    }
}
