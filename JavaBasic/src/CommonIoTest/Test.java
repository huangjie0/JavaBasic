package CommonIoTest;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

/*
*
* 使用common-io框架整合使用案例
* */
public class Test {
    public static void main(String[] args) throws IOException {
        //拷贝文件
        FileUtils.copyFile(new File("src/ln.txt"),new File("src/lnn.txt"));
        //拷贝文件夹
        FileUtils.copyDirectory(new File("F:\\ps\\ls"),new File("F:\\ps\\ls2"));
        //删除文件夹
        FileUtils.deleteDirectory(new File("F:\\ps\\ls2"));
    }
}
