package FileWriterTest;

import java.io.FileWriter;
import java.io.Writer;

public class Test {
    public static void main(String[] args) {
        try (Writer r = new FileWriter("src/aaa.txt",true)){
            r.write('a');
            r.write(97);
            r.write('黄');
            r.write("\r\n");
            //写入字符串进去
            r.write("我爱你重化工");
            //写入字符串一部分
            r.write("我爱你中国",0,2);
            //写一个字符数组进去
            char[] buffer = {'a','b','c','i','马'};
            r.write(buffer,0,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
