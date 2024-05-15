package Multithreading;
/**
 *
 * 创建线程方式二，实现接口
 *
 * */
public class MyThread2 implements Runnable{
    //重写run方法
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}
