package InterfaceBenefit;
/*
* 接口的好处
* */

public class test {
    public static void main(String[] args) {
        // 弥补单继承
        Student a = new A();

        Driver d = new A();
        d.driver();

        Singer s = new A();
        s.sing();
    }
}
class A extends Student implements Driver,Singer{
    @Override
    public void driver(){

    }

    @Override
    public void sing(){

    }
}

class B implements Driver{
    @Override
    public void driver(){

    }
}

class Student{

}

interface Driver{
    void driver();
}
interface Singer{
    void sing();
}


