package Abnormal;

import java.util.Scanner;

/**
 * 异常代码修复，捕获异常尝试修复
 * */
public class AbnormalRepair {
    public static void main(String[] args) {
        //需求，调用一个方法，让用户输入一个合适价格返回为止
        //尝试修复
        while (true) {
            try {
                System.out.println(getMoney());
            } catch (Exception e) {
                System.out.println("请您输入合法的数字");
            }
        }
    }
    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入合适的价格？");
            double money = sc.nextDouble();
            if(money > 0){
                return money;
            }else {
                System.out.println("您输入的价格不合适！！");
            }
        }
    }
}
