package InheritGoOver;

public class Fu {
    public void  helloWord(){
        System.out.println("你好世界！");
    }
    private void helloWord_1(){
        System.out.println("helloword");
    }
    protected void helloWord_2(){
        System.out.println("helloword!");
    }
    void helloWord_3(){
        System.out.println("helloword!!");
    }

    public void test(){
        helloWord_1();
        helloWord();
        helloWord_2();
        helloWord_3();
    }
}
