package AbstractClassTest;

public class test {
    public static void main(String[] args) {
        //掌握抽象类的好处
        Zoon z = new Cat();
        z.setName("猫");
        z.call();


        Zoon g = new Dog();
        g.setName("狗");
        g.call();
    }
}
