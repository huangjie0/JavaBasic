package GenericConsiderations;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        String l = list.get(2);
        System.out.println(l);
        //不支持基本数据类型，接受引用类型
//        ArrayList<int> list1 = new ArrayList<int>();
//        integer是整数的对象类型
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(10);
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(12.1);
    }
}
