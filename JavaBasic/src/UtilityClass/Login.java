package UtilityClass;

public class Login {
        //    生成4位随机验证码
    public static void main(String[] args) {
        String code = MyUtil.createCode(4);
        System.out.println(code);
        //    生成19位随机验证码

        String code2 = MyUtil.createCode(19);
        System.out.println(code2);
    }
}
