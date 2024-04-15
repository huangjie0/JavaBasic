package Debugger;

public class Debugger {
    public static void main(String[] args) {
//        debugger工具使用
        //案例求最大值
        int[] maxNumber = { 1,22,-1,0,22,0,0 };
        //默认是第一个最大值
        int max = maxNumber[0];
        for (int i = 1; i < maxNumber.length; i++) {
            if(maxNumber[i] > max){
                max = maxNumber[i];
            }
        }
        System.out.println("最大值为" + max);
    }
}
