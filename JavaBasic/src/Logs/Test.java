package Logs;
/*
* 日志技术
* */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    // 创建Logger日志对象
    public static final Logger Logger = LoggerFactory.getLogger("LogBackTest");

    public static void main(String[] args) {

        //日志框架
//        logback-core logback-classic
        try {
            Logger.info("除法方法开始执行了！！！！！");
            chu(10,0);
            Logger.info("除法方法执行成功了！！！！！");
        } catch (Exception e) {
            Logger.error("除法方法失败了");
        }
    }

    public static void chu(int a,int b){
        Logger.debug("参数a" + a);
        Logger.debug("参数b" + b);
        int c = a/b;
        Logger.info("结果是" + c);
    }
}
