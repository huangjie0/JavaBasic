package ArrayList;

import java.util.ArrayList;

public class ArragList {
    public static void main(String[] args) {
        //集合对象 JDK1.7
        ArrayList<String> list = new ArrayList<>();
        list.add("hhh");
        list.add("但是");
        list.add("发错地方");
        System.out.println(list);
        list.add(1,"你回家");
        System.out.println(list);
        String a = list.get(2);
        System.out.println(a);
        //获取集合长度
        System.out.println(list.size());
        System.out.println(list.remove(2));
        list.set(2,"jhjhjk");
        System.out.println(list);
    }
}
