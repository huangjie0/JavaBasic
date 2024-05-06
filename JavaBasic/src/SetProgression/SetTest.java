package SetProgression;
/*
* set集合 HashSet、LinkedHashSet、TreeSet
* */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
        Student s1 = new Student("黄杰",18,23.5);
        Student s2 = new Student("小明",20,24.5);
        Student s3 = new Student("小海",22,22.5);
        Student s4 = new Student("小李",29,20.5);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        //哈希表

    }
}
