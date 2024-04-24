package Enumeration;
/*
* 枚举
* */
public class test {
    public static void main(String[] args) {
        enumeration x = enumeration.X;
        System.out.println(x);
        enumeration y = enumeration.Y;
        //枚举可以提供额外的api方法
        enumeration [] all = enumeration.values(); //获取枚举全部对象
        enumeration a3 = enumeration.valueOf("Y");
        System.out.println(a3);
        //获取枚举名字
        System.out.println(a3.name());
        //获取枚举的索引
        System.out.println(a3.ordinal());
        System.out.println("---------------------------------");
        AbstractEnumeration y1 = AbstractEnumeration.Y;
        y1.go();
    }
}
