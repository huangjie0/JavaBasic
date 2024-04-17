package UtilityClass;

import java.util.Random;

public class MyUtil {
    public static String createCode(int n){
        String code = "";
        String data = "wqewqfsdfvsdfaxfdsgfhasfdgf";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return  code;
    }
}
