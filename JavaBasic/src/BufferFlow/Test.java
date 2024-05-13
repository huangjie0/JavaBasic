package BufferFlow;
/*
* 缓冲流
* */

import java.io.*;

public class Test {
    public static void main(String[] args) {
        //对原始流进行包装，提高数据读取的性能
        //字节缓冲输出流 字节缓冲输入流
        try(
            InputStream is = new FileInputStream("src/bb.txt");
            //定义字节缓冲输入流,8kb的缓冲池
            InputStream bis = new BufferedInputStream(is,8192 * 2);

            OutputStream os = new FileOutputStream("src/cc.txt");
            //定义字节缓冲输出流，8kb的缓冲池
            OutputStream bos = new BufferedOutputStream(os, 8192 * 2);
                ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer))  != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
