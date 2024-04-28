package JDK8Time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Duration_test {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.of(2020,10,1,12,11,11);
        LocalDateTime endTime = LocalDateTime.of(2022,10,1,12,11,11);

        Duration duration = Duration.between(startTime,endTime);
        //获取俩个时间对象间隔的信息
        //获取间隔多少天
        System.out.println(duration.toDays());
        //间隔多少小时
        System.out.println(duration.toHours());
        //间隔多少分钟
        System.out.println(duration.toMinutes());
        //间隔多少毫秒
        System.out.println(duration.toMillis());
        //间隔多少纳秒
        System.out.println(duration.toNanos());
    }
}
