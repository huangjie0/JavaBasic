package MethodRewriting;

public class A {
    public void print1(){
        System.out.println("print1");
    }
    public void print2(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    private void print3(){
        System.out.println("323232");
    }

    public static void print4(){
        System.out.println("你好！");
    }
}
