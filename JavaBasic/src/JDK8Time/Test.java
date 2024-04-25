package JDK8Time;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //设计不合理
        Date d = new Date();
        System.out.println(d.getYear() + 1900);

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));

        //可变对象，修改后信息丢失

        //线程不安全

        //不精确到纳秒，只能是毫秒

    }
}
