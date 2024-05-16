package PessimisticLockAndOptimisticLock;

public class MyRunnable implements Runnable{
    private int number; //记录浏览人次
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + "number ======>" + (++number));
            }
        }
    }
}
