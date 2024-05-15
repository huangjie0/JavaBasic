package Properties;
/*
*
* 写入properties文件中去
* */

import java.io.FileWriter;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.setProperty("huangjie","123456");
        p.setProperty("xiaohui","123");
        p.setProperty("xiaolizi","12356789");
        //将对象存入文件中去
        p.store(new FileWriter("src/iii.properties"),"i save many users!");
    }
}
