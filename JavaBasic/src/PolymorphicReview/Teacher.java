package PolymorphicReview;

public class Teacher  extends People {
    public String name = "老师name";
    @Override
    public void run(){
        System.out.println("老师跑的慢！");
    }
    public void teach(){
        System.out.println("老师要写教案");
    }
}
