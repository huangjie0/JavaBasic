package JavaApi.Object;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
            Student s = new Student("黄杰",23);
//            System.out.println(s.toString());
            System.out.println(s.toString());

            Student s2 = new Student("黄杰",23);
            System.out.println(s2.equals(s));
            System.out.println(s2 == s);
            System.out.println("---------------------------------------");


            User u1 = new User(1,"黄杰","1234",new double[]{99,0,97,0});
            System.out.println(u1.getId());
            System.out.println(u1.getUsername());
            System.out.println(u1.getPassword());
            System.out.println(u1.getScores());

            User u2 = (User)u1.clone();

            System.out.println(u2.getId());
            System.out.println(u2.getUsername());
            System.out.println(u2.getPassword());
            System.out.println(u2.getScores());

            //clone分为浅clone和深clone

    }
}
