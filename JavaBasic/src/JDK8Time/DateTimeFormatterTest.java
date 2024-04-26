package JDK8Time;
/*
*
* ateTimeFormatter使用代替之前格式化时间
*
* */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String s = formatter.format(now); //正向格式化
        System.out.println(s);
        //格式化时间另一种方法
        String s33 = now.format(formatter); //反向格式化
        System.out.println(s33);
        //解析时间
        String dateStr = "2020-10-12 10:12:11";
//        LocalDate ldt1 = LocalDate.parse(dateStr,formatter);
        LocalDate ld222 = LocalDate.parse(dateStr,formatter);
        System.out.println(ld222);
    }
}
