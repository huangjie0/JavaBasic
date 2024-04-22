package PolymorphicReview;

public class PolymorphicReview {
    public static void main(String[] args) {
        //对象多态，行为多态
        People p1 = new Teacher();
        p1.run();

        People p2 = new Student();
        p2.run();
    }
}
