package Multithreading;

import java.util.concurrent.Callable;

/**
 * 使用callable创建多线程
 * */

public class MyThread3 implements Callable<String> {
    private int n;

    public MyThread3(int n) {
        this.n = n;
    }

    //重写call方法
    @Override
    public String call() throws Exception {
//        描述线程的任务并返回结果
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return "求出了1-" + n + "的和为" + sum;
    }
}
