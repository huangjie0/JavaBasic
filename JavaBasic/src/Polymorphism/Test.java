package Polymorphism;

public class Test {
    public static void main(String[] args) {
        //对象多态
        //指向老师对象 指向学生对象
        Polymorphism p = new Teacher();
        p.run(); //运行看右边，编译看左边
        System.out.println(p.name);

        Polymorphism p1 = new Student();
        System.out.println(p1.name);
        p1.run();
        //多态独有功能调不了
//        p1.study();

        //多态优点 实现解耦合，右边对象可以随时替换业务随机改，将父类变量作为形参
        Student s = new Student();
        go(s);

        Teacher t = new Teacher();
        go(t);
    }
    public static void go(Polymorphism p){

    }
}
