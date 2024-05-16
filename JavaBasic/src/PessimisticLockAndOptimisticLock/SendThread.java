package PessimisticLockAndOptimisticLock;

import java.util.List;
import java.util.Random;

public class SendThread extends Thread{
    private List<String> list;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        //发礼物
        //对礼物进行加锁操作，必须唯一
        Random r = new Random();
        while (true){
            synchronized (list){
                if(list.size() < 10){
                    break;
                }
                String rs = list.remove(r.nextInt(list.size()));
                System.out.println(name + "发出了" + rs);
                count++;
            }
        }
    }
    public SendThread(List<String> list, String name){
        super(name);
        this.list = list;

    }
}
