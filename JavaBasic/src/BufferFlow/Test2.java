package BufferFlow;
/*
*
* 字符缓冲输入流
* */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test2 {
    public static void main(String[] args) {
        try(
                Reader r = new FileReader("src/cc.txt");
                BufferedReader br = new BufferedReader(r);
                ){
//            char[] buffer = new char[3];
//            int len;
//            while ((len = br.read(buffer)) != -1){
//                System.out.print(new String(buffer,0,len));
//            }

//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
            String len;
            while ((len = br.readLine()) != null){
                System.out.println(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
