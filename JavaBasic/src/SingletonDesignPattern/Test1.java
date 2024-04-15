package SingletonDesignPattern;

public class Test1 {
    public static void main(String[] args) {
        SingletonDesignPattern s1 = SingletonDesignPattern.getObject();
        SingletonDesignPattern s2 = SingletonDesignPattern.getObject();
        System.out.println(s1);
        System.out.println(s2);
    }
}
