package SingletonDesignPattern;
/*
* 单例设计模式
* */

public class SingletonDesignPattern {
//    私有类的构造器
//    饿汉单例对象模式
    private static SingletonDesignPattern s = new SingletonDesignPattern();
    private SingletonDesignPattern(){
    }
    public static SingletonDesignPattern getObject(){
        return s;
    }
}
