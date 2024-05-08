package VariableParameter;

import java.util.Arrays;

/**
 * 可变参数
 * */

public class Test {
    public static void main(String[] args) {
        //特点
        test();//不传
        test(10);//传一个数据
        test(10,12,13,143);//传一个数据
        test(new int[]{10,12,13});//传数组
    }
    public static void test(int...nums){
        //方法内部就是数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
    //可变参数注意事项

}
