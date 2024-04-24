package AnonymousInnerClass;
/*
* 匿名内部类常见用法
* */

public class test2 {
    public static void main(String[] args) {
        go(new Swimming(){
            @Override
            public void swim(){
                System.out.println("狗游泳");
            }
        });
    }
    public static void go(Swimming s){
        System.out.println("开始-----------------------");
        s.swim();
    }
}

//需求要求猫和狗都要参加游泳比赛
interface Swimming{
    void swim();
}
