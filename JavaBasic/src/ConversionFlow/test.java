package ConversionFlow;
/*
* 转换流
* */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class test {
    public static void main(String[] args) {
        //解决乱码问题
        //创建文件字符流与源文件接通
        try (Reader r = new FileReader("src/ln.txt"); BufferedReader br = new BufferedReader(r)){
            String len;
            while ((len=br.readLine()) != null){
                System.out.println(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
