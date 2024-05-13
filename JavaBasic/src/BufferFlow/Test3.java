package BufferFlow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
 * 字符缓冲输出流
 * */

public class Test3 {
    public static void main(String[] args) {
        try (
                Writer f = new FileWriter("src/lll.txt",true);
                BufferedWriter bw = new BufferedWriter(f);
                )
        {
            bw.write('a');
            bw.write(97);
//            bw.write("\r\n");
            bw.newLine();
            bw.write("我爱你中国！");
//            bw.write("\r\n");
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
