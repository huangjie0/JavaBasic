package StaticAttention;

public class Student {
    static String schoolName;
    double score;
    public static void printHelloWorld(){
        //注意同一个类访问类名可以不用写
        schoolName = "淮师";
        printHelloWorld2();
//        类方法不能使用this
//        System.out.println(this);
    }
    public static void printHelloWorld2(){

    }
    //实例方法
    public void printPass(){
        schoolName = "jhjh";
        printHelloWorld();
        this.printPass2();
    }
    public void printPass2(){

    }
}
