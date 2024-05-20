package Reflect;
/**
 * 反射，高级
 * */

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //加载类获取类的字节码
        //获取class对象,方式一
        Class c1 = Student.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getConstructors());

//        方式二
        Class c2 = Class.forName("Reflect.Student");
        System.out.println(c1 == c2);

        //方式三
        Student s = new Student();
        System.out.println(s.getClass() == c2);


    }
}
