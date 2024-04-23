package InterfaceMultipleInheritance;

public class test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.run();
    }
}
interface I{
    void test1();
}
interface J{
    String test1();
}

//不能继承，多个接口方法签名冲突无法继承
//interface K extends I,J{
//
//}
//一个类无法实现多个接口签名冲突
//class E implements I,J{
//
//}
class Fu{
    public void run(){
        System.out.println("===父类的run方法执行了=====");
    }
}
interface IT{
    default void run(){
        System.out.println("===接口中run方法执行了=====");
    }
}
class Zi extends Fu implements IT{

}

interface IT1{
    default void test(){
        System.out.println("IT1");
    }
}
interface IT2{
    default void test(){
        System.out.println("IT2");
    }
}
class N implements IT1,IT2{
    @Override
    public void test(){
        System.out.println("自己的test方法");
    }
}


