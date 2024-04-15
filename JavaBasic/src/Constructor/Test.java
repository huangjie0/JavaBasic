package Constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("黄杰",59.4);
        //构造器初始化赋值
        System.out.println(s2.name);
        System.out.println(s2.score);
        Teacher t = new Teacher("交换机");
    }
}
