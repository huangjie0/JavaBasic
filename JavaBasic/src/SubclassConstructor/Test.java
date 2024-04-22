package SubclassConstructor;

public class Test {
    public static void main(String[] args) {
        Z z = new Z();
        Z z2 = new Z("黄杰");
    }
}
class F{
    public F(){
        System.out.println("+++++父类无参数构造器执行了");
    }
}

class Z extends F{
    public Z(){
        System.out.println("=====子类无参数构造器执行了");
    }
    public Z(String name){
        System.out.println("----------子类有参构造器执行了----");
    }
}
