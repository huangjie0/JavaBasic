package ThreadCommunication;
/**
 * 线程通信
 * */

public class Test {
    public static void main(String[] args) {
        Desk desk = new Desk();

        //创建3个生产者（3个厨师）
        new Thread(()->{
            while (true) {
                desk.put();
            }
        },"厨师一").start();

        new Thread(()->{
            while (true) {
                desk.put();
            }
        },"厨师二").start();

        new Thread(()->{
            while (true) {
                desk.put();
            }
        },"厨师三").start();


        //创建2个消费者（2个吃货）
        new Thread(()->{
            while (true) {
                desk.get();
            }
        },"吃货一").start();

        new Thread(()->{
            while (true) {
                desk.get();
            }
        },"吃货二").start();
    }
}
