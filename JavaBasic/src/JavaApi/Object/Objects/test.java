package JavaApi.Object.Objects;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "黄杰";

        //System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));
        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));

    }
}
