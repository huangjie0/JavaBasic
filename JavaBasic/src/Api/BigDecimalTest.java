package Api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.3;
        double c = a+b;
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);

        BigDecimal c2 = a1.subtract(b1);
        System.out.println(c2);

        BigDecimal c3 = a1.divide(b1,2, RoundingMode.HALF_UP);
        System.out.println(c3);

        //将BigDecimal对象转化为double类型
        double rs = c3.doubleValue();
        System.out.println(rs);

    }
}
