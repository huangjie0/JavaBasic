package ConversionFlow;
/*
* 字符输出转换流
* */

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        //控制写出的字符编码，写出文件
        try(
                OutputStream os = new FileOutputStream("src/m.txt");
                Writer w = new OutputStreamWriter(os,"UTF-8");
                BufferedWriter bw = new BufferedWriter(w);
            ) {
            bw.write("我是中国人");
            bw.write("我爱你中国");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
