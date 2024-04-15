package Array;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //数组练习 定义直接给其赋值 静态初始化数组 引用数据类型
        int [] arr = new int[]{10,12,13};

        System.out.println(arr);//引用地址

        //简化写法
        int [] arr1 = { 18,23,33,44 };
        double [] arr2 = { 10,10.2,122.3 };
        System.out.println(arr2);

        //简化写法2 推荐
        int arr3[] = { 19,23,44, 55 };
        double arr4[] = { 11,11.2,11,22 };
        System.out.println(arr4);

        //访问数组名称
        int pp = arr[0];
        System.out.println(pp);

        arr[0] = 17;
        System.out.println(arr);
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        System.out.println(arr[9]);
        //获取数组的最大索引
        System.out.println(arr.length - 1);

//        数组遍历
        String age[] = {"小马","小明","小张","小李"};
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        int sum = 0;
        int age2[]={19,23,45,66,77};

        for (int i = 0; i < age2.length; i++) {
            sum+=age2[i];
        }

        System.out.println(sum);
        System.out.println("-------------------------");

        //动态初始化数组，可以引入长度
        int arr6[] = new int[3];
        arr6[0] = 2;
        arr6[1] = 3;
        arr6[2] = 66;
        System.out.println(arr6[0]);
        System.out.println("-------------");

//        char类型默认值为0
        char arr8[] = new char[2];
        System.out.println((int)arr8[0]);
        boolean arr7[] = new boolean[2];
        System.out.println(arr7[0]);
        String name8[] = new String[2];
        System.out.println(name8[0]);

        //案例评委打分,动态数组
        double score_1[] = new double[6];
        Scanner r = new Scanner(System.in);
        for (int i = 0; i < score_1.length; i++) {
            System.out.println("请您输入当前分数？");
            double str = r.nextDouble();
            score_1[i] = str;
        }

        double sumi = 0;
        for (int i = 0; i < score_1.length; i++) {
            sumi += score_1[i];
        }

        System.out.println(sumi);

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

        //数组反转
        int [] number5 = { 10,20 };
//        设置俩个变量一个在前一个在后面
        for (int i = 0, j = number5.length-1;i < j;i++,j--) {
            //定义一个临时变量
            int tmp = number5[j];
            number5[j] = number5[i];
            number5[i] = tmp;
        }

        for (int i = 0; i < number5.length; i++) {
            System.out.println(number5[i]);
        }

        //随机排名
        int []code = new int[5];
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < code.length; i++) {
            System.out.println("请输入用户" + (i+1) + "的工号");
            int code_2 = sr.nextInt();
            code[i] = code_2;
        }

        //将其打乱 --洗牌游戏
        Random r1 = new Random();
        for (int i = 0; i < code.length; i++) {
            int index = r1.nextInt(code.length);
            //定义临时变量
            int tmp = code[index];
            code[index] = code[i];
            code[i] = tmp;
        }

        for (int i = 0; i < code.length; i++) {
            System.out.println(code[i]);
        }
    }
}
