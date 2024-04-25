package StringBuilder;

import java.util.StringJoiner;

/**
 * 案例
 */

public class test3 {
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{1,2,3,4,5}));
    }
    public static String getArrayData(int[] arr){
        //判断是否为null
        if(arr == null) return null;
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        for (int i = 0; i < arr.length; i++) {
//            if(i == arr.length-1) {
//                sb.append(arr[i]);
//            }else {
//                sb.append(arr[i]).append(",");
//            }
//        }
//        sb.append("]");
//        return sb.toString();
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }
}
