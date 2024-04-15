package StringDemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        // 开发登录界面
        Scanner sr = new Scanner(System.in);
        for (int i = 0;i<3;i++){
            System.out.println("请您输入登录名称");
            String name = sr.next();
            System.out.println("请您输入登录密码");
            String password = sr.next();
            //调用登录方法
            boolean rs = login(name,password);
            if(rs){
                System.out.println("欢迎进入系统");
                break;
            }else {
                System.out.println("登录失败！");
            }
        }
    }

    public static boolean login(String loginName,String password){
        //准备系统正确密码
        String okLoginName = "黄杰";
        String okLoginPassword = "123456";
        //判断是否成功，不能用==
        return loginName.equals(okLoginName) && password.equals(okLoginPassword);
    }
}
