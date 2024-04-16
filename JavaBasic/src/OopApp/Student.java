package OopApp;

public class Student {
    double score;
    //类变量
    static String name;
    //成员变量（对象变量）
    int age;
    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("Hello world");
    }
    public void printScore(){
        System.out.println("成绩：" + (score >= 60 ? "及格" : "不及格"));
    }
}
