package PolymorphicReview;

public class Teacher  extends People {
    @Override
    public void run(){
        System.out.println("老师跑的慢！");
    }
}
