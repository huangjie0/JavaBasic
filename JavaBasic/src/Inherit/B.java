package Inherit;
//子类
public class B extends A{
    //子类继承父类非私有成员
    public void print3(){
        System.out.println(i);
        print();
//        j是私有的
//        System.out.println(j);
    }
}
