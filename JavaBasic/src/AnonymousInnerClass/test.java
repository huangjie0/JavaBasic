package AnonymousInnerClass;
/*
* 匿名内部类
* */

public class test {
    public static void main(String[] args) {
//        Animal c = new Cat();
//        c.cry();
        //匿名内部类编译成一个子类，立即创建子类对象
        Animal a = new Animal(){
            @Override
            public void cry(){
                System.out.println("猫喵喵叫！！！！！");
            }
        };
        a.cry();
    }
}

abstract class Animal{
    public abstract void cry();
}

//class Cat extends Animal{
//    @Override
//    public void cry(){
//        System.out.println("猫喵喵叫！！！！！");
//    }
//}

