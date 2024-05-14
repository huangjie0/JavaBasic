package PrintStream;

import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * 打印流
 * */

public class Test {
    public static void main(String[] args) {
        //printStream printWriter  打印输入流 打印输出流
        try (PrintStream ps = new PrintStream("src/ln.txt", Charset.forName("UTF-8"));){
            ps.println(97);
            ps.println('a');
            ps.print("你好哦");
            ps.print(true);
            ps.print(99.5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
