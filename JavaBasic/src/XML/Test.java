package XML;
/*
* 解析xml文件
* */

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建dom4j解析器对象
        SAXReader saxReader = new SAXReader();
        //读取文档对象
        Document d = saxReader.read("src\\XML\\huangjie.xml");
        //获取根元素对象
        Element root = d.getRootElement();
//        System.out.println(root.getName());

        //获取根元素下面的全部一级子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }
        //获取指定元素的
        List<Element> elements2 = root.elements("User");
        for (Element element : elements2) {
            System.out.println(element.getName());
        }
        //获取当前元素下的某个元素
        Element p = root.element("People");
        System.out.println(p.getName());

    }
}
