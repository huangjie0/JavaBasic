package PermissionModifier;

public class Fu {
    //私有修饰符
    private void privateMethod(){
        System.out.println("===private====");
    }
    //缺省修饰符
    void method(){
        System.out.println("====缺省=====");
    }
    //protected修饰符 同一个包的下的类，任意包下的子类
    protected void protectedMethod(){
        System.out.println("===protected===");
    }
    //public 任意包下的类都行
    public void publiceMethod(){
        System.out.println("===public===");
    }

    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publiceMethod();
    }
}
