package SetProgression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * collection集合的遍历方式,不支持for循环遍历，不确定有无索引
 * */

public class CollectionErgodicMode {
    public static void main(String[] args) {
        //迭代器
        Collection<String> c = new ArrayList<>();
        c.add("黄杰");
        c.add("小明");
        c.add("小虎");
        System.out.println(c);

        //使用迭代器遍历集合
        Iterator<String> it = c.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        //通过迭代器遍历循环遍历集合元素
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
