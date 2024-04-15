package StringDemo;
/*
* 处理string的方法
* */

public class StringMethod {
    public static void main(String[] args) {
        String s = "你好java";
        //获取字符串长度
        System.out.println(s.length());
        //提取字符串的某个索引字符
        char c = s.charAt(1);
        System.out.println(c);
        //字符串遍历
        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(i);
            System.out.println(e);
        }
        System.out.println("------------------------");
        //将字符串转为字符数组
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
        //判断字符串内容一样,返回true
        String sq = new String("黑马");
        String pp = new String("黑马");
        System.out.println(sq.equals(pp));
        //忽视大小写比较内容
        String oo = new String("HHhhHHHhhohH");
        String rr = new String("HHhhHHHhhohh");

        System.out.println(oo.equalsIgnoreCase(rr));

        //截取字符串,包前不包后
        String s4 = "还能好好";
        System.out.println(s4.substring(0,3));

        //从当前位置截取字符串末尾
        System.out.println(s4.substring(2));

        //将字符串替换新内容并返回新内容
        String info = "这个简直是个垃圾！";
        String info1 = info.replace("垃圾","好电影");
        System.out.println(info1);

        //包含字符串中是否包含关键字返回boolean
        String info2 = "你好啊";
        System.out.println(info2.contains("你"));

        //判断字符串是否某个字符为开头
        String s7 = "张三丰";
        System.out.println(s7.startsWith("张"));

        //用来制定内容进行切割
        String s8 = "与刚刚,有个谷,谷谷,谷";
        String s100[] = s8.split(",");
        for (int i = 0; i < s100.length; i++) {
            System.out.println(s100[i]);
        }

    }
}
