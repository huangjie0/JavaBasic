package Api;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //Date对象
        Date d = new Date();
        System.out.println(d);
        //获取时间毫秒值
        long time = d.getTime();
        System.out.println(time);

        //将时间毫秒值转为日期对象
        time += 2*1000;
        Date d2 = new Date(time);
        System.out.println(d2);

        //把日期对象时间通过setTime修改
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);


    }
}
