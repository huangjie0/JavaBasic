package This;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        //打印内存地址
        System.out.println(s1);
        //this指向地址
        s1.printThis();
        System.out.println("------------------------------------------");
        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();


        System.out.println("-----------------------------");
        Student s3 = new Student();
        s3.score = 325;
        s3.printPass(250);
    }
}
