package XML;
/*
* 解析xml文件
* */

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建dom4j解析器对象
        SAXReader saxReader = new SAXReader();
        //读取文档对象
        Document d = saxReader.read("src\\XML\\huangjie.xml");
        //获取根元素对象
        Element root = d.getRootElement();
        System.out.println(root.getName());

    }
}
