package FlowControlTest;

import java.util.Random;
import java.util.Scanner;

public class FlowControlTest {
    public static void main(String[] args) {
        //生成随机数案例 0-9
        Random r = new Random();
//        调用方法0-9随机整数
        for (int i=1; i<=20; i++) {
            int data = r.nextInt(10);
            System.out.println(data);
        }

        System.out.println("----------------------");

        //减加法
        //生成区间随机数 1-10
        int data2 = r.nextInt(10) + 1;
        System.out.println(data2);


        System.out.println("-----------------------");
        //生成3到17之间随机数
        int data3 = r.nextInt(15) + 3;
        System.out.println(data3);

        //案列三 猜数字
        Random r1 = new Random();
        int number = r1.nextInt(100);
        System.out.println("请你输入猜测的数字？");
        while (true){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a > number){
                System.out.println("猜的数字大！");
            } else if (a < number) {
                System.out.println("猜的数字小");
            } else {
                System.out.println("恭喜才对");
                break;
            }
        }
    }
}
