package Inherit;

/*
* 继承
*/
public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.print();
        System.out.println(b.i);
        Teacher t = new Teacher();
        t.setName("黄杰");
        t.setSkill("Java Spring");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();
    }
}
