package StringDemo;
/*
* string的对象不可变的字符串对象
* */

public class StringAttention {
    public static void main(String[] args) {
        String name = "荷马";
        name += "回家就回家";
        name += "玻璃";
        System.out.println(name);

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        //new String,每new一次创建一次新对象
        char[] chars = {'a','b','c'};
        String a = new String(chars);
        String a2 = new String(chars);
        System.out.println(a == a2);
    }
}
