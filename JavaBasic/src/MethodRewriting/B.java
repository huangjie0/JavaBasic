package MethodRewriting;

public class B extends A{
    //方法重写
    @Override
    public void print1(){
        System.out.println("32232343234");
    }
    @Override
    public void print2(int a,int b){
        System.out.println("112121212");
    }

//    私有方法不能重写
//    @Override
//    private void print3(){
//        System.out.println("3232323232");
//    }
//   静态方法不能重写
//    @Override
//    public static void print4(){
//        System.out.println("ewrwr");
//    }

    public static void main(String[] args) {
        B b = new B();
        b.print1();
        b.print2(1,2);
    }
}
