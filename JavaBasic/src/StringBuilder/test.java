package StringBuilder;

/*
*
* StringBuilder好处及用法
*
* */

public class test {
    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder(); //无参构造器
        //有参构造器
        StringBuilder s2 = new StringBuilder("黄杰");
        //拼接内容
        s2.append(12);
        s2.append("换句话菊花");
        s2.append(true);
        System.out.println(s2);
        //支持链式编程
        s2.append(666).append(2323).append(23);

        //反转操作
        s2.reverse();
        System.out.println(s2);
        System.out.println(s2.length());

        //将stringBuilder转成string类型
        String sl = s2.toString();
        System.out.println(sl);
    }
}
