package SetProgression;
/*
* set集合 HashSet、LinkedHashSet、TreeSet
* */

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
//        Set<Integer> s = new HashSet<>();//无序不重复无索引
//        Set<Integer> s = new LinkedHashSet<>();//有序不重复无索引
        Set<Integer> s = new TreeSet<>();//排序（升序） 不重复 无索引
        s.add(66);
        s.add(63);
        s.add(6);
        s.add(6);
        System.out.println(s);
        Set<Student> ss = new TreeSet<>((o1, o2) -> Double.compare(o1.getHeight(),o2.getHeight()));
        Student s1 = new Student("黄杰",18,23.5);
        Student s2 = new Student("小明",20,24.5);
        Student s3 = new Student("小海",22,22.5);
        Student s4 = new Student("小李",29,20.5);
        Student s5 = new Student("小李",29,20.5);
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//        System.out.println(s5.hashCode());
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        ss.add(s4);
        ss.add(s4);
        ss.add(s5);
        //哈希表
//        hashSet基于数组加链表（jdk8之前，新元素存入数组，占老元素位置，老元素挂在下面）（jdk8之后，新元素直接挂在老元素下面，红黑树）
        System.out.println(ss);

    }
}
