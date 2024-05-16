package ThreadPool;

import java.util.concurrent.*;

/**
 * 线程池
 * */

public class Test {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3,5,8,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4),Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());
        //线程池处理runnable任务
        Runnable target = new MyRunnable();
        pool.execute(target); //自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); //自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); //自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); //复用核心线程
        pool.execute(target); //复用核心线程
        pool.execute(target); //复用核心线程
        pool.execute(target); //复用核心线程

        pool.execute(target); //复用核心线程
        pool.execute(target); //复用核心线程
        //拒绝新任务
        pool.execute(target); //复用核心线程

//        pool.shutdown(); //等任务执行完毕后关闭
//        pool.shutdownNow();
}
}
