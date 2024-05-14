package PrintStream;

import java.io.PrintStream;

public class Test3 {
    public static void main(String[] args) {
        try( PrintStream ps = new PrintStream("src/ln.txt");) {
            //将系统默认的对象改成自己设置的对象
            System.setOut(ps);
            System.out.println("11111");
            System.out.println("22222");
            System.out.println("33333");
            System.out.println("44444");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
