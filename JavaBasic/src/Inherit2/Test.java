package Inherit2;

public class Test {
    public static void main(String[] args) {
        //目标 掌握子类访问其他成员特点，就近原则
        Z zl = new Z();
        zl.showName();
        zl.showMethod();
    }
}
