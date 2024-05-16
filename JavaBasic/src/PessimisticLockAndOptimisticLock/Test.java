package PessimisticLockAndOptimisticLock;
/**
 * 悲观锁和乐观锁
 * */

public class Test {
    public static void main(String[] args) {
        //悲观锁，一上来就加锁，没有安全感，每次只能一个线程访问完毕后再解锁，线程安全，性能较差
        //乐观锁，一开始不上锁，等出现线程安全才开始控制，他线程安全，性能较好，大家一起跑
        Runnable target = new MyRunnable2();

        for (int i = 1; i <= 100; i++) {
            new Thread(target).start();
        }
    }
}
