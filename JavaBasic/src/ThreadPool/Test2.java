package ThreadPool;

import java.util.concurrent.*;

/**
 *
 * 线程池处理callable任务
 * */

public class Test2 {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = new ThreadPoolExecutor(3,5,8,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());
        //处理callable任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

//        Future<String> f5 = pool.submit(new MyCallable(500));
    }
}
