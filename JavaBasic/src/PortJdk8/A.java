package PortJdk8;
/*
*
* jdk8k接口新增
* */

public interface A {
    //默认使用default,默认使用public
//    实例方法，对象方法，必须使用实现类的对象访问
    default void test1(){
        System.out.println("===默认方法===");
//        test2();
    }

    //私有方法，必须使用private修饰（JDK9开始支持） 对象的私有方法
//    private void test2(){
//        System.out.println("====私有方法====");
//    }
    //静态方法
    public static void test3(){
        System.out.println("====静态方法=====");
    }

}
