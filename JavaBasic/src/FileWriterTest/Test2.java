package FileWriterTest;

import java.io.FileWriter;
import java.io.Writer;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Writer w = new FileWriter("src/ooo.txt");

        w.write('a');
        w.write(97);
        w.write("\r\n");
        w.write("我爱你中国");
        w.write("我爱你中国");

//        w.flush();
//        w.write("张三");
//        w.flush();
        w.close();//关闭流包含刷新操作，刷新可以继续往里面写数据
    }
}
