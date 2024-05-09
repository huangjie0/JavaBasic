package Stream;
/*
 * Stream流操作集合数组的数据
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","赵敏","张强");
        System.out.println(list);

        //找出姓张的名字，存入到集合中去
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张") && s.length()==3){
                newList.add(s);
            }
        }
        System.out.println(newList);

        //使用Stream流解决问题,链式调用
        List<String> l = list.stream().filter(s -> s.startsWith("张")).filter(s->s.length()==3).collect(Collectors.toList());
        System.out.println(l);
    }
}
