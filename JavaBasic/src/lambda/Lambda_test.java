package lambda;
/**
 *
 * lambda简化写法，参数类型可以简化不用写，只有一个参数的时候，()可以不用写
 * 如果只有一行代码，大括号和分号可以不用写 如果这行代码有return return也可以不用写
 * */

public class Lambda_test {
    public static void main(String[] args) {
//        Animal dog = new Animal(){
//            @Override
//            public void run(){
//                System.out.println("狗跑的快！！！");
//            }
//        };
//        dog.run();
        //lambda表达式并不是简化全部匿名内部类，只能简化函数式接口匿名内部类
        //错误代码
//        Animal dog = () -> {
//            System.out.println("狗跑的快！！！");
//        };
//        dog.run();
//        Swimming s = new Swimming(){
//            @Override
//            public void swim(){
//                System.out.println("学生快乐的游泳！");
//            }
//        };
//        s.swim();
        Swimming s = ()->{
            System.out.println("学生快乐的游泳！");
        };
        s.swim();
    }
}
abstract class Animal{
    public abstract void run();
}
interface Swimming{
    void swim();
}
