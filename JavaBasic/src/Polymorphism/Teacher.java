package Polymorphism;

public class Teacher extends Polymorphism{
    public String name = "黄杰老师";
    @Override
    public void run(){
        System.out.println("老师跑的气喘嘘嘘！");
    }
    public void test(){
        System.out.println("老师不需要考试");
    }
}
