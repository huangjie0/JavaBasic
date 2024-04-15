package HeavyLoad;

public class HeavyLoad {
    public static void main(String[] args) {
        //方法重载
        test();
        test(100);
        fire();
        fire("韩国");
        fire("韩国",3);
    }
    public static void test(){
        System.out.println("test1");
    };
    public static void test(int a){
        System.out.println("test2");
    };

    void test(double a){

    };
    int test(int a,int b){
        return a + b;
    };
    //执行次代码会报错，方法名和形参相同
//    int test(int a){
//
//    };
   public static int test(int a,double q,int f){
        return a+(int)q+f;
   };
   //顺序不一样
    public static int test(double q,int a,int f){
        return (int)q + a +f;
    };

//    案例
    public static void fire(){
        //默认发射一枚武器
        System.out.println("默认给岛国发射一枚武器！");
        fire("岛国");
    };
    public static void fire(String country){
        System.out.println("发射一枚武器给" + country);
        fire("美国",1000);
    }
    public static void fire(String country,int number){
        System.out.println("发射" + number + "枚武器给" + country);
    };
}
