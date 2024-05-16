package PessimisticLockAndOptimisticLock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        //100份礼品同时发放小明和小红，当礼品小于10份的时候，不在发放，在控制台打印各自的多少分礼物
        List<String> list = new ArrayList<>();
        String[] names = {"口红","包包","鲜花","剃须刀","皮带","手表"};
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(names[r.nextInt(names.length)] + (i+1));
        }
        System.out.println(list);

        SendThread s1 =  new SendThread(list,"小明");
        s1.start();

        SendThread s2 = new SendThread(list,"小红");
        s2.start();

        s1.join();
        s2.join();

        System.out.println(s1.getCount());
        System.out.println(s2.getCount());
    }
}
