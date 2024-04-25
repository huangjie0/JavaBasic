package StringBuilder;

public class test2 {
    public static void main(String[] args) {
        //掌握stringBuilder的好处
//        String res = "";
//        for (int i = 0; i <= 1000000; i++) {
//            res = res+="abc";
//        }
//        System.out.println(res);

//        使用stringBuilder计算
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);

        //StringBuilder线程不安全与StringBuffer线程安全
    }
}
