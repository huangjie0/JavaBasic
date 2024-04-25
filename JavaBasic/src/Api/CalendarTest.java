package Api;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        //得到系统对应的日厉对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //获取日历中某个信息
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int days = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //获取日厉对象
        Date d = c.getTime();
        System.out.println(d);

        //获取时间毫秒值
        long time = c.getTimeInMillis();
        System.out.println(time);

        //修改日历某个信息

    }
}
