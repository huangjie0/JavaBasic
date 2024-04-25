package Api;

/*
* 时间秒杀案例
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondKill {
    public static void main(String[] args) throws ParseException {
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:10:18";
        String xp = "2023年11月11日 0:10:57";

        //将字符串时间解析成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date s = sdf.parse(start);
        Date e = sdf.parse(end);
        Date xj2 = sdf.parse(xj);
        Date xp2 = sdf.parse(xp);

        //判断是否秒杀成功
        long s1 = s.getTime();
        long e1 = e.getTime();
        long xj22 = xj2.getTime();
        long xp22 = xp2.getTime();

        //比较
    }
}
