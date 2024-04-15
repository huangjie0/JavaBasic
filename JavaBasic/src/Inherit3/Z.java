package Inherit3;

public class Z extends F{
    public Z(){
        super(2); //默认存在
        System.out.println("子类构造器调用");
    }
    public Z(int a){
        super(2);
        System.out.println("子类有参构造器调用");
    }
}
