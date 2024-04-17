package InheritGoOver;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);
        b.print3();
        System.out.println(b.j);
        Teacher t = new Teacher();
        t.setSkill("跑步");
        t.setName("王雷");
        t.printInfo();
    }
}
