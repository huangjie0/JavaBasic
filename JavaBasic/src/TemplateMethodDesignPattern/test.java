package TemplateMethodDesignPattern;

public class test {
    public static void main(String[] args) {
        //目标，抽象类应用场景，用来设计模板方法模板
        Teacher t = new Teacher();
        t.write();

        Student s = new Student();
        s.write();
    }
}
