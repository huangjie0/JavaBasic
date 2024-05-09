package Map;

import java.util.*;

/**
 * map集合是键值队集合
 * */

public class Test {
    public static void main(String[] args) {
        //hashMap,linkHashMap
//        Map<String,Integer> map1 = new HashMap<>(); //按照键无序，不重复，无索引
        Map<String,Integer> map1 = new LinkedHashMap<>(); //按照键有序，不重复，无索引
        map1.put("手表",100);
        map1.put("手表",2);
        map1.put("手机",1);
        map1.put("Java",2);
        map1.put(null,null);
        System.out.println(map1);

        Map<Integer,String> map2 = new TreeMap<>(); //可排序，不重复，无索引
        map2.put(23,"java");
        map2.put(20,"mysql");
        map2.put(2,"html");
        map2.put(29,"vue");
        System.out.println(map2);

        //map常用方法
        //获取map集合的大小
        System.out.println(map1.size());
        //清空map集合
//        map1.clear();
        //判断map集合是否为空
        System.out.println(map1.isEmpty());
        //根据键获取值
        System.out.println(map1.get("手机"));
        System.out.println(map1.get("111"));
        //根据键删除整个元素，返回键的值
        System.out.println(map1.remove("手表"));
        //判断map集合是否包含某个键
        System.out.println(map1.containsKey("Java"));
        //判断是否包含某个值
        System.out.println(map1.containsValue(2));
        //获取map集合的全部键,返回数据放在set集合里面去
        Set<String> s = map1.keySet();
        System.out.println(s);
        //获取所有的值
        Collection<Integer> mp = map1.values();
        System.out.println(mp);
        //将其他map集合导入自己数据
//        map1.putAll(map2);
        Map<String,Integer> map3 = new LinkedHashMap<>();
        map3.put("书包",109);
        map3.put("书",1);
        map1.putAll(map3);
        System.out.println(map1);
        System.out.println(map3);
        //map集合的遍历方式 1、键找值 2、键值对 3、lambda表达式
        //键找值
        Map<String,Double> m = new HashMap<>();
        m.put("蜘蛛精",190.1);
        m.put("小明",170.1);
        m.put("小李",174.1);
        m.put("小刘",174.1);
        System.out.println(m);
        Set<String> keys= m.keySet();
        System.out.println(keys);
        for (String key : keys) {
            //根据键获取对应的值
            double value = m.get(key);
            System.out.println(key + value);
        }
        //键值对
        //entrySet将map集合转换成键值对类型
        Set<Map.Entry<String, Double>> entries = m.entrySet();
        for(Map.Entry<String, Double> entry : entries){
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "--->" + value);
        }
        System.out.println("---------------------------------------");
        //lambda表达式
        m.forEach((k,v)->{
            System.out.println(k + "--->" + v);
        });
        
    }
}
