package Final;
/*
* final作用,修饰后不能继承，重写，当修饰变量时候，只能赋值一次
* */

public class test {
    public static void main(String[] args) {
        final int a;
        a = 12;
//        a = 13 不能二次赋值
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

