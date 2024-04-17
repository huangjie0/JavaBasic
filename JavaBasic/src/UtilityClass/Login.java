package UtilityClass;

public class Login {
    public static void main(String[] args) {
        String code = MyUtil.createCode(4);
        System.out.println(code);

        String code2 = MyUtil.createCode(19);
        System.out.println(code2);
    }
}
