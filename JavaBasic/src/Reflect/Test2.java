package Reflect;

import org.junit.Test;
import java.lang.reflect.Constructor;

public class Test2 {
    @Test
    public void testGetConstructor(){
        //获取类class对象
        Class c1 = Student.class;
        //只能获取public修饰的构造器
        Constructor[] c = c1.getConstructors();
        //获取全部的构造器
        Constructor[] c2 = c1.getDeclaredConstructors();
//        System.out.println(c1.getConstructors())
        for (Constructor constructor : c2) {
            //获取构造器的名字
            System.out.println(constructor.getName());
            //获取构造器的参数
            System.out.println(constructor.getParameterCount());
        }
    }
    @Test
    public void testGetOneConstructor() throws Exception {
        //获取类class对象
        Class c1 = Student.class;
        //获取无参数构造器,修饰public
        Constructor c3 = c1.getConstructor();
        Student sc = (Student) c3.newInstance();
        //禁止检查访问权限
        c3.setAccessible(true);
        System.out.println(sc);
//        System.out.println(c3.getName());
//        System.out.println(c3.getParameterCount());
        Constructor c4 = c1.getDeclaredConstructor();
//        System.out.println(c4.getName());
//        System.out.println(c4.getParameterCount());

        //获取有参数构造器
        Constructor cc = c1.getDeclaredConstructor(String.class,int.class,String.class);
//        System.out.println(cc.getName());
//        System.out.println(cc.getParameterCount());
        Student cc1 = (Student) cc.newInstance("huangjie",20,"呼呼");
        System.out.println(cc1);
    }
}
