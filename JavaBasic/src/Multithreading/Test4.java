package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Callable<String> call = new MyThread3(200);
        //把callable封装成futureTask对象，任务对象

        FutureTask<String> f = new FutureTask<>(call);
        new Thread(f).start();

        //获取线程完毕的结果
        String s = f.get();
        System.out.println(s);

    }
}
