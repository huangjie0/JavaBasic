package Multithreading;
/**
 * 线程的一些方法
 * */

public class Test5 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号子线程");
//        t1.setName("1号子线程");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("2号子线程");
//        t2.setName("2号子线程");
        t2.start();
        System.out.println(t2.getName());

        //主线程的对象
        //哪个线程执行就会得到哪个线程的名字
        Thread m = Thread.currentThread();
        System.out.println(m.getName());  //main

        for (int i = 0; i <= 5; i++) {
            System.out.println("main线程输出" + i);
        }
    }
}
