package JDK8Time;

import java.time.LocalDate;

public class LocalDate_Test {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        //获取日期相关的内容
        //年
        int Year = ld.getYear();
        //月
        int month = ld.getMonthValue();
        //日
        int day = ld.getDayOfMonth();
        //获取一年的第几天
        int dayOfYear = ld.getDayOfYear();
//        星期几
        int dayOfWeek = ld.getDayOfWeek().getValue();
        System.out.println(Year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);

        //修改年月日相关信息,基本用with
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(5);
        System.out.println(ld2);
        System.out.println(ld3);
    }
}
