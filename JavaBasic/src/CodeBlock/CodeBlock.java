package CodeBlock;
/*
* 代码块
* */
public class CodeBlock {
    static int number = 80;
    static String school;
//    静态代码块
    static{
        System.out.println("静态代码块执行了");
        school = "你好解决";
    }
//    实例代码块，每次创建对象调用
    {
        System.out.println("实例代码块执行了");
    }
    public CodeBlock(){
        System.out.println("无参数构造器执行");
    }
    public CodeBlock(String name){
        System.out.println("有参数构造器执行");
    }
}
