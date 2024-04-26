package JDK8Time;
/*
*
* 时间戳代替date
*
* */

import java.time.Instant;

public class Timestamp {
    public static void main(String[] args) {
        Instant now = Instant.now(); //不可变对象，传统的date是可变对象

        //获取总秒数
        long second = now.getEpochSecond();
        System.out.println(second);

        //获取不够一秒的纳秒
        int nano = now.getNano();
        System.out.println(nano);

        System.out.println(now);
        Instant n = now.plusNanos(111);
        //作用
        Instant i1 = Instant.now();
        //所要分析的代码
//        System.out.println(i1);
        Instant i2 = Instant.now();
    }
}
