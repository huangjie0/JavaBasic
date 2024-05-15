package Multithreading;
/*
* 实现多线程的方式三
* */
public class Test3 {
    public static void main(String[] args) {
        //创建接口的匿名内部类
//        Runnable target = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println("子线程的序号" + i);
//                }
//            }
//        };
//        new Thread(target).start();
        //简化写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("子线程的序号" + i);
                }
            }
        }).start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程的序号" + i);
        }

    }
}
