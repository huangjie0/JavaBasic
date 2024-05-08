package SetProgression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetConcurrencyProblem {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小路子");
        list.add("小傻子");
        list.add("红歌会");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if(s.contains("小")){
                it.remove();
            }
        }
        System.out.println(list);

        //使用for
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            if(s.contains("小")){
//                list.remove(s);
//                i--;
//            }
//        }
//        System.out.println(list);
    }
}
