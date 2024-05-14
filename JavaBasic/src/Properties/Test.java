package Properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        System.out.println(p);

        //开始加载文件属性到对象中去
        p.load(new FileReader("src\\Properties\\user.properties"));
        System.out.println(p);
        System.out.println(p.getProperty("zwj"));
        System.out.println(p.getProperty("zdh"));
        System.out.println(p.getProperty("zm"));

        //遍历全部的键值对
        Set<String> keys = p.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
