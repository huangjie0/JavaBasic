package JDK8Time;
/*
*
* period
*
* */

import java.time.LocalDate;
import java.time.Period;

public class Period_test {
    public static void main(String[] args) {
        //创建对象
        LocalDate l1 = LocalDate.of(2029,8,12);
        LocalDate l2 = LocalDate.of(2029,4,12);

        Period period = Period.between(l1,l2);

        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        System.out.println(period.getDays());
    }
}

