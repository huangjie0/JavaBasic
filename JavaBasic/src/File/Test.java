package File;

import java.io.File;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        File f1 = new File("F:\\ps\\ab.txt");
//        File f1 = new File("F:" + File.separator + "ps" + File.separator + "111.png");
        //返回文件字节个数,文件大小
        System.out.println(f1.length());
        System.out.println(f1.exists());

        File f2 = new File("D:/fdf/dsd/txt");
        System.out.println(f2.length());
        //判断文件存不存在
        System.out.println(f2.exists());
        //判断是否是文件，file
        System.out.println(f1.isFile());
        //判断是否是文件夹
        System.out.println(f1.isDirectory());
        //获取文件的名字
        System.out.println(f1.getName());
        //返回文件的字节个数
        System.out.println(f1.length());
        //获取文件的最后修改时间
//        f1.lastModified()
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(f1.lastModified()));

    }
}
