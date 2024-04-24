package PackagingGroup;
/*
* 包装类
* */

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //包装类
//        Integer a = new Integer(12);
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        //自动将基本数据类型转化为对象,装箱操作
        Integer a3 = 12;
        //拆箱
        int a4 = a3;
        //泛型和集合不支持基本数据类型，只支持引用数据类型
//        ArrayList<int> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        int rs = list.get(1);

        System.out.println("---------------------------");
        //将基本数据类型转化成字符串
        Integer a = 323;
        String ss = Integer.toString(a);
        System.out.println(ss + 1);

        String rs2 = a.toString();
        System.out.println(rs2 + 1);

        String res2 = a + "";
        System.out.println(res2 + 1);

        //将字符串类型数值转换成基本数据类型
        String ageStr = "23";
        int i = Integer.parseInt(ageStr);
        System.out.println(i + 1);

        String scoreStr = "12.1";
        double s = Double.parseDouble(scoreStr);
        System.out.println(s + 2);
        //建议使用转化
        //将小数的字符串转为double 推荐
        double sp = Double.valueOf(scoreStr);
        int aa = Integer.valueOf(ageStr);

        System.out.println("----------------------");
    }
}
