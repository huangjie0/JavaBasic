package JDK8Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate_Test {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
//        LocalTime lt = LocalTime.now(); 年月日时分秒纳秒,同理，多了一个纳秒
//        LocalDateTime ldt = LocalDateTime.now(); 年月日时分秒纳秒，同理，多了一个纳秒
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
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusDays(3);
        LocalDate ld6 = ld.plusMonths(1);
        System.out.println(ld2);
        System.out.println(ld3);

        //获取指定的localDate对象
        LocalDate ld22 = LocalDate.of(2099,12,12);
        LocalDate ld29 = LocalDate.of(2011,12,12);

        //判断2个日期对象是否相等，在前还是在后
        System.out.println(ld22.equals(ld29));
        //之后
        System.out.println(ld22.isAfter(ld29));
        //之前
        System.out.println(ld22.isBefore(ld29));

        //将LocalDateTime转换为LocalTime和LocalTime
         LocalDateTime ldt = LocalDateTime.now();
         LocalDate ld_2 = ldt.toLocalDate();
         LocalTime lt_2 = ldt.toLocalTime();

//         将LocalTime对象和LocalTime对象合并
        LocalDateTime ldt_3 = LocalDateTime.of(ld_2,lt_2);

    }
}
