package Variable;

public class Variable {
    public static void main(String[] args) {
        //变量 整形
        //-128到127
        byte c = 127;
        short d = 12121;
        int a = 77;
        long e = 32L;
        //小数,默认是double
        float u = 3.13F;
        double b = 22.2;
        System.out.println(b);
        char ah = '1';
        char sas = '中';
        char hhj = 'h';
        boolean h = true;
        //引用数据类型
        String name = "你好";
        System.out.println(name);

        //类型转换，范围小的赋值给大的类型 byte---->int
        byte l = 12;
        int j = l;
        int hgh = 100;
        double hh = hgh;
        System.out.println(hh);
        byte h2 = 10;
        int dss = 12;
        long jjg = 23;
//        表达式最终运算由最高类型决定
        long ii = h2 + dss + jjg;
        System.out.println(ii);
        double yy = h2 + dss + 0.1;
//        double最大定义为double类型
        System.out.println(yy);
        byte io = 10;
        short oo = 30;
        int pp = io + oo;
//        byte和short自动转换为int类型运算
        System.out.println(pp);
        byte df = 88;
        byte hsdf = 66;
        int vhg = df + hsdf;
        System.out.println(vhg);

        //强制类型转换，将大范围的变量赋值给小范围变量
        int ggd = 20;
        byte hjh = 23;
        byte hj = (byte) ggd;
        int ghg = 1500;
        byte sdf = (byte) ghg;
        System.out.println(sdf);
        double hhjs = 99.5;
        int ghgqw = (int) hhjs;
        System.out.println(ghgqw);

        //基本算数运算符
        int ggfgg = 5;
        int hhh = 8;

        System.out.println(ggfgg + hhh);
        System.out.println(ggfgg - hhh);
        System.out.println(ggfgg * hhh);
        System.out.println(1.0 * hhh / ggfgg);
        int ghgu = 5;
        String hhho = "uui";
        System.out.println(hhho + ghgu);

        //自增运算符,只能操作变量
        int v2hg = 29;
//        v2hg++;
        ++v2hg;
        v2hg--;
        System.out.println(v2hg);
        //赋值运算符 += ,-=
        double jj = 9.5;
        double bkj = 232;
//        System.out.println(jj+=bkj);
        System.out.println(jj/=bkj);
        //关系运算符
        System.out.println(6 >= 1);
        System.out.println(6 >= 9);
//        逻辑运算符
        double hg = 9.8;
        int fgj = 16;
//        且运算符 &
        boolean flag = hg >= fgj & hg > 10;
        System.out.println(flag);
//        或运算符 |
        boolean flag2 = hg <= fgj | hg > 11;
        System.out.println(flag2);
//        取反运算符 !
        boolean flag3 = !(hg<fgj);
//        ^
        System.out.println(flag3);
        System.out.println(false ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ true);

        //短路运算符 && 左边为false右边不执行
        int dfs = 10;
        int sdfas = 22;
        System.out.println(dss > 11 && sdfas > 22);
        // ||运算符 左边为true右边不执行
        System.out.println(dfs > 12 || sdfas < 20);
//       三元运算符
        double h2jh = 68;
        String hhuuh = h2jh > 50 ? "你好" : "换行";
        System.out.println(hhuuh);
        int q = 7;
        int w = 8;
        int p2p = q > 9 ? 2 : 0;
        System.out.println(p2p);
    }
}