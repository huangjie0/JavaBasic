package Tool;

import java.util.Random;
/*
* 工具类
* */

public class MyUtil {
//    将其私有处理
    private MyUtil(){
    }
    public static String createCode(int n){
        String code = "";
        String data = "aadhsafdasdifgadhiffhasifdhsadi";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
