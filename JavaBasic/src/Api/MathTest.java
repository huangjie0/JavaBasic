package Api;

public class MathTest {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(-2));
        System.out.println(Math.abs(123));
        System.out.println(Math.abs(-3.14));
        //向上取整
        System.out.println(Math.ceil(4.42));
        System.out.println(Math.ceil(4.33));
        //向下取整
        System.out.println(Math.floor(4.03));
        //四舍五入
        System.out.println(Math.round(3.444));
        System.out.println(Math.max(1,2));
        System.out.println(Math.min(1,2));
        System.out.println( Math.pow(2,3));
        System.out.println(Math.pow(2,4));
//        0.0-1.0
        System.out.println(Math.random());

    }
}
