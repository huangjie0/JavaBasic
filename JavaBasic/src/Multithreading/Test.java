package Multithreading;
/**
 * 多线程技术,注意事项，调用start()不要调用run方法，不要把主线程任务放在启动子线程之前
 * */
public class Test {
    public static void main(String[] args) {
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("主线程序号" + i);
//        }
        Thread t = new MyThread();
        //自动执行run方法
        t.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程序号" + i);
        }
    }
}
