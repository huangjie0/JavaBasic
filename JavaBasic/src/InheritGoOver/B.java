package InheritGoOver;

public class B extends A{
    public int j = 2323;
    //子类继承父类非私有成员
    public void print3(){
        //访问非私有成员
        System.out.println(i);
        //访问非私有方法
        printHello();
    }

}
