package Stream;
/*
 * Stream流操作集合数组的数据,相当于流水线操作数据
 * */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        //获取stream流


        //List集合
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"小明","小张","小李","小兰");
        Stream<String> stream1 = names.stream();


        //Set集合
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"成龙","李小龙","赵信","马德华");
        Stream<String> s = set.stream();
        s.filter(v -> v.contains("德")).forEach(e -> System.out.println(e));


        //Map集合Stream
        Map<String,Double> map = new HashMap();
        map.put("迪丽热巴",180.2);
        map.put("德玛西亚",160.2);
        map.put("刘德华",178.2);
        Set<String> key = map.keySet();
        Stream ks = key.stream();

        Collection<Double> vs = map.values();
        Stream sv = vs.stream();

        Set<Map.Entry<String,Double>> entries = map.entrySet();
        Stream<Map.Entry<String,Double>> se = entries.stream();
        se.filter(w -> w.getKey().contains("巴")).forEach(r-> System.out.println(r.getKey() + "---->" + r.getValue()));

        //数组的Stream流
        String[] ss = {"张消化","张明","张力","王奕斐"};
        Stream<String> stream4 = Arrays.stream(ss);
        Stream<String> stream5 = Stream.of(ss);
        
    }
}
