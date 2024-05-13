package Io;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try(
                //放置资源对象
                InputStream is = new FileInputStream("D:\\188e7282ba15bc20949a52041ba2ca5.png");
                OutputStream os = new FileOutputStream("F:/ps/meinv.png");
            )
        {
            byte[] buffer = new byte[1024]; //1kb
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成！！");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
