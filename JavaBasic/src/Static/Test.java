package Static;

public class Test {
    public static void main(String[] args) {
        Static.name = "胡ANG";
        Static s = new Static();
        s.age = 20;
        //不推荐
        s.name = "回家就回家";
        System.out.println(Static.name);
        Static s2 = new Static();
        s2.age = 30;
        System.out.println(s2.age);
        System.out.println(s.age);
        System.out.println(s2.name);
    }
}
