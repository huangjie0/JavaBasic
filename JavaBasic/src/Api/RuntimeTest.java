package Api;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        //java环境信息的类
        //单例类,只创建一次
        Runtime t = Runtime.getRuntime();
//        t.exit(0);
        //获取虚拟机使用处理器数
        System.out.println(t.availableProcessors());
        //java虚拟机的内存总量
        System.out.println(t.totalMemory()/1024.0/1024.0);
        //java虚拟机可用环境
        System.out.println(t.freeMemory()/1024.0/1024.0);
        //启动某个程序，返回程序对象
        Process p = t.exec("\'C:\\Users\\huangjie\\Desktop\\百度网盘.lnk\'");
        Thread.sleep(5);
        //销毁程序
        p.destroy();
    }
}
