package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建一个集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("宁夏枸杞");
        list.add("枸杞");
        list.add("青海枸杞");
        list.add("西藏枸杞");
        list.add("小刀");
        list.add("哇哈哈");
        list.add("瓜子");
        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            if(ele.contains("枸杞")){
//                list.remove(ele);
//            }
//        }
//        System.out.println(list);
//        方式一
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            if(ele.contains("枸杞")){
//                list.remove(ele);
//                i--;
//            }
//        }
//        System.out.println(list);
//      方式二
        for (int i = list.size() - 1; i>=0; i--){
            String ele = list.get(i);
            if(ele.contains("枸杞")){
                list.remove(ele);
            }
        }
        System.out.println(list);
    }
}
