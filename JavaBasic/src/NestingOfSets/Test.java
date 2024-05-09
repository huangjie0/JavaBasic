package NestingOfSets;

import java.util.*;

/**
 * 集合的嵌套
 * */

public class Test {
    public static void main(String[] args) {
        //定义一个map集合
        Map<String, List<String>> list = new HashMap<>();
        List<String> js = new ArrayList<>();
        Collections.addAll(js,"南京市","泰州市","连云港市","苏州市");
        list.put("江苏省",js);


        List<String> ah = new ArrayList<>();
        Collections.addAll(ah,"合肥市","马鞍山市","芜湖市","安庆市");
        list.put("安徽省",ah);

        List<String> hl = new ArrayList<>();
        Collections.addAll(hl,"郑州","安阳","南阳","商丘");
        list.put("河南省",hl);

        System.out.println(list);

        System.out.println(list.get("安徽省"));
        list.forEach((p,c)->{
            System.out.println(p + "--->" + c);
        });
    }
}
