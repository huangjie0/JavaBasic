import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //案例一买车票
        double price = calculate(1000,3,"经济舱");
        System.out.println("优惠价" + price);
        //案列二验证码
        String c =  verification(5);
        System.out.println(c);
        //案列三评委打分
        double d = mark(3);
        System.out.println(d);
        //案列四数据加密
        System.out.println(encipher(1983));
        int a[] = {10,23,33};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    //买票方法
    public static double calculate(double price,int month,String type){
        //判断当前月份是淡季还是旺季
        if(month >= 5 && month <= 10){
            //旺季
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }

        }else {
            //淡季
            switch (type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.5;
                    break;
            }
        }
        return price;
    }
    //验证码案列
    public static String verification(int n){
            Random r = new Random();
            String code = "";
            for (int i = 0; i < n; i++) {
                //可能是数字或者字母 0-2随机数
                int type = r.nextInt(3);
                switch (type){
                    case 0:
                        code += r.nextInt(10);
                        //随机一个数字字符
                        break;
                case 1:
                    char ch1 = (char)(r.nextInt(26) + 65);
                    code += ch1;
                    //随机一个大写字符
                    break;
                case 2:
                    char ch2 = (char)(r.nextInt(26) + 97);
                    code += ch2;
                    //随机一个小写字符
                    break;
            }
        }
        return code;
    }
    //评委打分
    public static double mark(int number){
        int arr[] = new int[number];
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "位评委的分数");
            int n = sr.nextInt();
            arr[i] = n;
        }
        int sum = 0;
        int max = arr[0]; //最大值
        int min = arr[0]; //最小值

        for (int i = 0; i < arr.length; i++) {
            int score = arr[i];
            sum += arr[i];
            if(score > max){
                max = score;
            }
            if(score < min){
                min = score;
            }
        }
        return 1.0*(sum-max-min)/(number - 2);
    }
    public static String encipher(int number){
        int[] numbers = split(number);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        //反转函数
        reversal(numbers);
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }

    public static int[] split(int n){
        int[] numbers = new int[4];
        numbers[0] = n / 1000;
        numbers[1] = (n / 100) % 10;
        numbers[2] = (n / 10) % 10;
        numbers[3] = n % 10;
        return numbers;
    }

//    反转
    public static void reversal(int[] n){
        //反转数组
        for (int i = 0 , j = n.length - 1; i < j; i++,j--){
            int tmp = n[j];
            n[j] = n[i];
            n[i] = tmp;
        }
    }
    //数组拷贝
    public static int[] copy(int[] arrs){
        int arr2[] = new int[arrs.length];
        for (int i = 0; i < arrs.length ; i++) {
            arr2[i] = arrs[i];
        }
        return arr2;
    }
}
