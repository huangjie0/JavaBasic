package UnitTest;

public class StringUtil {

//    字符串的长度
    public static void printNumber(String name){
        if(name == null){
            System.out.println(0);
            return;
        }

        System.out.println("名字长度是" + name.length());
    }
//    求字符串的最大索引
    public static int getMaxIndex(String data){
        if(data == null){
            return -1;
        }
        return data.length();
    }
}
