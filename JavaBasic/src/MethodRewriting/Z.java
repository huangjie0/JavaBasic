package MethodRewriting;

public class Z extends F{
    String name = "子类名称";
    public void showName(){
        String name = "局部名称";
        //访问父类的name,就近原则
        System.out.println(name);
        //访问当前对象的name
        System.out.println(this.name);
        System.out.println(super.name);
    }

    @Override
    public void print1(){
        System.out.println("重写print1");
    }
    public void showMethod(){
        print1();
        super.print1();
    }
}
