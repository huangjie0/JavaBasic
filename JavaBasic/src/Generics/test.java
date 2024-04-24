package Generics;

import java.util.ArrayList;

/**
 * 泛型的认识和使用，泛型接口泛型类泛型方法
 * */

public class test {
    public static void main(String[] args) {
        //目标泛型
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        for (int i = 0; i < list.size(); i++) {
            String e = list.get(i);
            System.out.println(e);
        }
        System.out.println("--------------------------");
//        约束操作类型
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1111");
        list1.add("2222");
        list1.add("3333");

        for (int i = 0; i < list1.size(); i++) {
            String a = list1.get(i);
            System.out.println(a);
        }
    }
}

class Cat{

}
