package Multithreading;
/**
 * 多线程创建方式一
 * */

public class MyThread  extends  Thread{
    public MyThread(String name){
        super(name);
    }
    public MyThread(){}
    @Override
    public void run(){
        Thread t = Thread.currentThread();
        //描述线程执行顺序
        for (int i = 0; i <= 5; i++) {
            System.out.println(t.getName() + "输出" + i);
        }
    }
}
