package Multithreading;
/**
 *
 * 掌握sleep方法,join方法
 * */

public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
            if(i ==3){
                //暂停5s
                Thread.sleep(5000);
            }
        }

        Thread t1 = new MyThread("1号线程");
        t1.start();
        //保证有顺序的进行
        t1.join();
        Thread t2 = new MyThread("2号线程");
        t2.start();
        t2.join();
        Thread t3 = new MyThread("3号线程");
        t3.start();
        t3.join();

    }
}
