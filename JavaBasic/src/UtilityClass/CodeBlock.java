package UtilityClass;
/*
* 静态代码块
* 静态代码块在类调用的时候执行一次，完成页面的初始化操作
* */
public class CodeBlock {
    static int number = 88;
    int score;
    static String schoolName;
    //静态代码块，在类加载一次，执行一次,完成类的初始化操作
    static {
        System.out.println("静态代码块执行了！！！");
        schoolName = "淮北师范大学";
    }
//    实例代码块
    {
        score = 12;
        System.out.println("实例代码快执行了");
    }
    public CodeBlock(){
        System.out.println("无参数构造器执行了！！！！！！");
    }
    public CodeBlock(String name){
        System.out.println("有参数构造器执行了！！");
    }
}
