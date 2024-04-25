package Api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(s.format(time));
        //将字符串时间转为日期对象
        System.out.println("-------------------");
        String dateStr = "2020-12-10 12:12:11";
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = s1.parse(dateStr);
        System.out.println(d2);

    }
}
