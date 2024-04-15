package Function;

public class Function {
    public static void main(String[] args) {
        //方法
//        int a = 10;
//        int b = 11;
//        int c = a + b;
        int c = sum(10,11);
        int c2 = sum(19,29);
        System.out.println("和为" + c);
        System.out.println("和为" + c2);

        System.out.println("------------------");
        int a1 = 12;
        int b1 = 16;
        int c1 = a1 * b1;
        System.out.println("乘为" + c1);

        System.out.println("------------------");
    }

    //方法 求和方法封装d
    public static int sum(int a,int b){
        return  a + b;
    }
}
