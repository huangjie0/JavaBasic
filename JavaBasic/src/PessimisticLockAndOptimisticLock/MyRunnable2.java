package PessimisticLockAndOptimisticLock;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable2 implements Runnable{
//    private int number; //记录浏览人次
    //整数修改的乐观锁，原子类实现
    private AtomicInteger number = new AtomicInteger();
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "number ======>" + number.incrementAndGet());
        }
    }
}
