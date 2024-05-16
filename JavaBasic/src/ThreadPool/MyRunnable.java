package ThreadPool;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("输出666" + name);
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
