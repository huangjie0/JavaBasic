package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 操作集合的工具类，不是集合
 * */

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //addAll为一切集合批量添加元素
        Collections.addAll(list,"张三","李四","王麻子");
        System.out.println(list);
        //shuffle
        Collections.shuffle(list);
        System.out.println(list);
        //sort
        List<Integer> l = new ArrayList<>();
        Collections.addAll(l,5,2,3,4);
        Collections.sort(l);
//        Collections.sort(Students,new Comparator<Student>(){
//                  ......
//        });
    }
}
