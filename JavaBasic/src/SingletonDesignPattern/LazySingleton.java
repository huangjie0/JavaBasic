package SingletonDesignPattern;
/*
* 懒汉式单例设计
* */
public class LazySingleton {
    private static LazySingleton l;
    //1、将类构造器私有
    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if(l == null){
            l = new LazySingleton();
        }
        return l;
    }
}
