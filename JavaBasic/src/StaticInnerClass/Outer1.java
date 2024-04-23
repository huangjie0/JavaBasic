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

        }
    }
}
