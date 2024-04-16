package OopApp;

public class Test {
    public static void main(String[] args) {
        Student.name = "黄杰";

        //不推荐
        Student s1 = new Student();
        s1.name="看看模块";
        s1.score = 90;

        //不推荐
        Student s2 = new Student();
        s2.name = "斤斤计较";
        System.out.println(Student.name);
        Student.printHelloWorld();
        Student s3 = new Student();
        s3.printHelloWorld();

        //实例方法使用
        s1.printScore();
    }
}
