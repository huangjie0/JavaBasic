package JDK8Time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {
    public static void main(String[] args) {
        //获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);
        //获取所有java全部Id
        System.out.println(ZoneId.getAvailableZoneIds());
        //将某个id封装成某个zoneid对象
        ZoneId zoneId1 = ZoneId.of("America/Marigot");
        ZonedDateTime zdt =  ZonedDateTime.now(zoneId1);
        System.out.println(zdt);
        ZonedDateTime z =  ZonedDateTime.now(Clock.systemUTC());
        System.out.println(z);
        ZonedDateTime z3 = ZonedDateTime.now();
        System.out.println(z3);
        //常用与localDate一样获取修改等等操作
    }
}
