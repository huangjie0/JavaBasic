package SetProgression;
/*
* set集合
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

    }
}
