package inputTest;
import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        //导包
        Scanner sc = new Scanner(System.in);
        //调用sc键盘事件
        System.out.println("请输入你的年龄？");
        int dsd = sc.nextInt(); //直到用户输入一个整数，直到用户按下回车键，才会拿到数据
        System.out.println("你的年龄是" + dsd);
        System.out.println("请输入您的名字：");
        String hjh = sc.next();
        System.out.println("欢迎进入系统");
    }
}
