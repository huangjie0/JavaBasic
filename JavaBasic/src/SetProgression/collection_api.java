package SetProgression;
/*
* collection单列集合常用方法
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class collection_api {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>(); //多态写法
        //常用方法
        list.add("小明");
        list.add("小明");
        list.add("小张");
        list.add("小李");
        System.out.println(list);
        //清空集合
//        list.clear();
        System.out.println(list);
        //判断集合是否是空
        System.out.println( list.isEmpty());
        //获取集合的大小
        System.out.println(list.size());
        //判断集合中是否包含某个元素
        System.out.println(list.contains("小明"));
        //删除某个元素，如果是多个重复元素默认删除前面的第一个！
        list.remove("小明");
        System.out.println(list);
        //将集合转为数组写法
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        //强制转换为string类型的数组
        String[] arr2 = list.toArray(new String[list.size()]);
        System.out.println(arr2);
        System.out.println("------------------------------------------------");
        //将一个集合的全部数据倒入到另一个集合中去
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        //将c2集合内容倒入到c1里面去
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
