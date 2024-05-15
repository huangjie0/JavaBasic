package Multithreading;
/**
 * 多线程创建方式一
 * */

public class MyThread  extends  Thread{
    @Override
    public void run(){
        //描述线程执行顺序
        for (int i = 0; i <= 5; i++) {
            System.out.println("序号" + i);
        }
    }
}
