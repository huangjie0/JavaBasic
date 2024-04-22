package PolymorphicReview;

public class Student extends People {
    @Override
    public void run(){
        System.out.println("学生跑的快！");
    }
}
