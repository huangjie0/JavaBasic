package SubclassConstructor;

public class Test {
    public static void main(String[] args) {
        Z z = new Z();
        Z z2 = new Z("黄杰");
    }
}
class F{
//    public F(){
//        System.out.println("+++++父类无参数构造器执行了");
//    }
    public F(String name,int age){

    }
}

class Z extends F{
    public Z(){
        super("黄鸡",17);
        System.out.println("=====子类无参数构造器执行了");
    }
    public Z(String name){
        super("晃晃",18);
        System.out.println("----------子类有参构造器执行了----");
    }
}
