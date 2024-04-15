package Polymorphism;

public class Student extends Polymorphism{
    public String name="小明";
    @Override
    public void run(){
        System.out.println("学生跑的快");
    }
    public void study(){
        System.out.println("学习成绩非常优异！");
    }
}
