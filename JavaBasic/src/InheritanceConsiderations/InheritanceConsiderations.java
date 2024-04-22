package InheritanceConsiderations;
/**
 * 继承的注意事项,方法重写
 * */

public class InheritanceConsiderations {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A extends Object {

}
class B extends A{}
//单继承,多层继承
class C extends B{

}
