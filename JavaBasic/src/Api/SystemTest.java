package Api;

public class SystemTest {
    public static void main(String[] args) {
        //人为终止虚拟机
//        System.exit(0);
        System.out.println("------------------");
        //获取系统事件,1970到现在的毫秒时间
        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 100000; i++) {
            System.out.println("输出了");
        }

        long time2 = System.currentTimeMillis();
        System.out.println(time2-time);

    }
}
