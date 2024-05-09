package Map;

import java.util.*;

/**
 * map集合的案例
 * */

public class MapDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] selects = {"A","B","C","D"};
        Random r = new Random();
        for (int i = 1; i < 81; i++) {
            int index = r.nextInt(4);
            list.add(selects[index]);
        }
        System.out.println(list);
        //统计每个景点的投票人数
        Map<String,Integer> m = new HashMap<>();
        for (String s : list) {
            if(m.containsKey(s)){
                m.put(s,m.get(s) + 1);
            }else {
                m.put(s,1);
            }
        }
        System.out.println(m);
    }
}
