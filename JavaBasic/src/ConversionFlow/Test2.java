package ConversionFlow;

import java.io.*;
/*
* 字符输入转换流解决乱码问题
*
* */

public class Test2 {
    public static void main(String[] args) {
        //获取文件原始字节流
        try (
                InputStream is = new FileInputStream("src/ln.txt");
                Reader r = new InputStreamReader(is,"GBK");
                BufferedReader br = new BufferedReader(r);
                ){
            String len;
            while ((len = br.readLine()) != null){
                System.out.println(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
