package StringJoiner;
/*
*
* StringJoiner操作
* */

import java.util.StringJoiner;

public class test {
    public static void main(String[] args) {
//        StringJoiner s = new StringJoiner(",");
        StringJoiner s = new StringJoiner(",","[","]");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        s.add("java4");
        System.out.println(s);
    }
}
