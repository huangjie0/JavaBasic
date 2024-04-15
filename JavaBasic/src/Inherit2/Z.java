package Inherit2;

public class Z extends F{
    public String name = "小美女";
    public void showName(){
        String name = "局部名字";
        System.out.println(name);//局部变量
        //访问子类变量名字
        System.out.println(this.name); //子类变量
        System.out.println(super.name); //访问父类成员变量
    }
    @Override
    public void print1(){
        System.out.println("我想搞钱！");
    }
    public void showMethod(){
        print1(); //就近调子类重写方法
        super.print1();
    }
}
