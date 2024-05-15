package Multithreading;

public class Test2 {
    public static void main(String[] args) {
        Runnable target = new MyThread2();
        new Thread(target).start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程在执行" + i);
        }
    }
}
