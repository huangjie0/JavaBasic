package AbstractClass;

/*
* 一个类继承抽象类，必须重写完抽象类的所有方法，否则自己也是抽象类
* */

public class B extends A{
    @Override
    public void run(){
        System.out.println("跑步！！！！！");
    }
}
