package InnerClass;
/*
* 内部类，一个类定义在另一个类的内部为内部类
* */

public class test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.setName("黄俊杰");
        in.test2();
    }
}
