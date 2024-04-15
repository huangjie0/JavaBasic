package Constructor;

public class Student {
    String name;
    double score;
    public Student(){
        //无参数构造器
        System.out.println("无参数构造器执行了！");
    }
    public Student(String name,double score){
        //有参数构造器
        System.out.println("有参数构造器执行了！");
        this.name = name;
        this.score = score;
    }
}
