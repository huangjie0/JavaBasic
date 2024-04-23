package PolymorphicReview;
/**
 * 多态及好处
 **/

public class PolymorphicReview {
    public static void main(String[] args) {
        //对象多态，行为多态 变量看左边
        People p1 = new Teacher();
        p1.run();
        //多态调子类独有的功能实现强转
        Teacher p3 = (Teacher)p1;
        p3.teach();

        System.out.println(p1.name);

        People p2 = new Student();
        p2.run();
        System.out.println(p2.name);

        Student s = new Student();
        Teacher t = new Teacher();
        go(s);
        go(t);
    }
    public static void go(People p){
        p.run();
        //调独有功能实现强转判断
        if(p instanceof Student){
            Student s = (Student) p;
            s.run();
        } else if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            t.teach();
        }
    }
    //独有功能调不了
    //p1.teach();
}
