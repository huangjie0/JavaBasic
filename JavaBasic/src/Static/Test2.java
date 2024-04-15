package Static;

public class Test2 {
    public static void main(String[] args) {
        //要求用户类创建多少对象
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        User u4 = new User();
        System.out.println(User.number);
        Student.printHelloWorld();
        Student s = new Student();
        s.score = 70;
        s.printScore();
    }
}
