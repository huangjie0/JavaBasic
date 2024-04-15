package EntityClass;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("黄杰");
        s.setScore(17);
        System.out.println(s.getName());
        System.out.println(s.getScore());
        StudentControls s1 = new StudentControls(s);
        s1.printScore();
    }
}
