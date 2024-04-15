package Function;

public class FunctionTest {
    public static void main(String[] args) {
        printHello(5);
        System.out.println(sum(77,11));
        System.out.println(add(100));
        int arrs[] = { 10,20,30,4 };
        //引用类型传递
        change(arrs);
        int arr1[] = { 10,23,45,66 };
        int arr2[] = { 22,11,22 };
        System.out.println("------------------------");
        System.out.println(equals(arr1,arr2));
    }

    //不需要返回数据加void
    public static void printHello(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("hello");
        }
    }

    //方法常见问题不能放入main方法里面，若里面无返回值类型不能加return数据,加了return不能执行后面数据,方法不调用不执行
    public static int sum(int a,int b) {
        int c = a + b;
        return c;
    }

    //求1-n的和
    public static int add(int i){
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += j;
        }
        return sum;
    }
    //执行原理，栈先进后出
    //数据传递，基本数据，引用类型
    public static void change(int[] arrs1){

        if(arrs1 == null){
            System.out.println(arrs1);
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arrs1.length; i++) {
//            if(i == arrs1.length -1){
//                System.out.print(arrs1[i]);
//            }else {
//                System.out.print(arrs1[i] + ",");
//            }
            System.out.print(i == arrs1.length - 1 ? arrs1[i] : arrs1[i] + ",");
        }
        System.out.print("]");
    }

    //判断俩个数组是否相等
    public static boolean equals(int[] arr1,int[] arr2){
        //判断arr1与arr2是否为null
        if(arr1 == null && arr2 == null){
            return true;
        }
        if(arr1 == null || arr2 == null){
            return false;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
