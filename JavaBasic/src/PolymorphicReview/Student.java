package PolymorphicReview;

public class Student extends People {
    public String name = "学生name";
    @Override
    public void run(){
        System.out.println("学生跑的快！");
    }
}
