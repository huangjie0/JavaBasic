package InnerClass;

public class Outer {
    private int age = 90;
    public static String a;
//    成员内部类
    public class Inner{
        private int age = 99;
        private String name;
//        public static String schoolName; //Jdk16开始支持

        public void test(){

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void test2(){
            int age = 77;
            //访问本函数定义的age
            System.out.println(age);
            //访问内部类的age
            System.out.println(this.age);
            //访问外部类的age
            System.out.println(Outer.this.age);
        }
    }
    public void test2(){
        System.out.println(age);
        System.out.println(a);
    }
}
