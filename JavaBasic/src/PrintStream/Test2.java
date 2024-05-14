package PrintStream;

import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Test2 {
    public static void main(String[] args) {
        //printWriter打印输出流
        try (PrintWriter pw = new PrintWriter("src/ln.txt", Charset.forName("UTF-8"));){
            pw.println(97);
            pw.println('a');
            pw.print("你好哦");
            pw.print(true);
            pw.print(99.5);
            pw.write(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
