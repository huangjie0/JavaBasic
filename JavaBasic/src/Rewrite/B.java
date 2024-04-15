package Rewrite;

public class B extends Rewrite{
    @Override //安全可读性好
    public void print1(){
        //方法重写,方法名和形参列表一样
        System.out.println("666");
    }
    @Override
    public void print2(int a,int b){
        System.out.println("666666");
    }
}
