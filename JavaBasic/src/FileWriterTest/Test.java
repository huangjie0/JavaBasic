package FileWriterTest;

import java.io.FileWriter;
import java.io.Writer;

public class Test {
    public static void main(String[] args) {
        try (Writer r = new FileWriter("src/aaa.txt")){
            r.write('a');
            r.write(97);
            r.write('黄');
            //写入字符串进去
            r.write("我爱你重化工");
            //写入字符串一部分
            r.write("我爱你中国",0,2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
