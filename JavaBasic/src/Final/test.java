package Final;
/*
* final作用,修饰后不能继承，重写，当修饰变量时候，只能赋值一次
* */

public class test {
    public static final String SCHOOL_NAME = "黑马";
    private final int age = 30;
    public static void main(String[] args) {
        final int a;
        final int[] qw = {1,2,3,4};
        a = 12;
//        a = 13 不能二次赋值
//        schoolName = "白哦吗";
        qw[1] = 2;
    }
}
final class A{

}
//不能继承A类
//class B extends A{
//
//}
class C{
    public void test(){

    }
}
class D extends C{
    @Override
    public void test(){

    }
}

