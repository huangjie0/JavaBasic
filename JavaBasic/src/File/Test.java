package File;

import java.io.File;

public class Test {
    public static void main(String[] args) {
//        File f1 = new File("F:\\ps\\111.png");
        File f1 = new File("F:" + File.separator + "ps" + File.separator + "111.png");
        //返回文件字节个数,文件大小
        System.out.println(f1.length());
        System.out.println(f1.exists());

        File f2 = new File("D:/fdf/dsd/txt");
        System.out.println(f2.length());
        //判断文件存不存在
        System.out.println(f2.exists());

    }
}
