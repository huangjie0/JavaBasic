package SetProgression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

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

        //增强for循环,遍历数组和集合
        for (String s:c){
            System.out.println(c);
        }

        String[] arr= { "小例子","画虎","火炬护"};
        for (String ca:arr){
            System.out.println(ca);
        }

        System.out.println("--------------------------");

        //使用lambda表达式遍历
        c.forEach(System.out::println);
        //电影对象案例
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("宝贝计划",80.2,"成龙"));
        movies.add(new Movie("阿凡达",82.2,"匿名"));
        movies.add(new Movie("阿凡达2",83.2,"匿名"));

        System.out.println(movies);

    }
}
