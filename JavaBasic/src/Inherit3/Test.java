package Inherit3;

public class Test {
    public static void main(String[] args) {
        //子类构造器特点，先调用父类的无参数构造器，再调用自己的
        Z z = new Z(9);
    }
}
