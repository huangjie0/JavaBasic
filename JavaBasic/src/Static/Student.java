package Static;

public class Student {
    double score;
//    类方法,工具类
    public static void printHelloWorld(){
        System.out.println("hello world");
    }
//    实例方法
    public void printScore(){
        System.out.println(score > 60 ? "成绩及格" : "不及格");
    }
}
