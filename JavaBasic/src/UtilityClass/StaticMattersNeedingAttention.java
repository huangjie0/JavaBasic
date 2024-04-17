package UtilityClass;

public class StaticMattersNeedingAttention {
    static String school;
    double score;

    //类方法
    public static void hello(){
        school = "淮南师范学院";
//        不可访问实列成员
//        score = 2121.212;
    }

    //实例方法
    public void helloT(){
        school = "hhj";
        hello();
        this.printHello();
    }
    public void printHello(){

    }
}
