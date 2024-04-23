package StaticInnerClass;

public class Outer1 {
    private int age;
    private static String name;
    public static class Inner1{

        private String name;
        public static int a;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void test(){
            System.out.println(name);
//            System.out.println(age);
        }
    }
    public static void test2(){
        System.out.println(name);
        //静态方法不能访问实例成员
//        System.out.println(age);
    }
}
