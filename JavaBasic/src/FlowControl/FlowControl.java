package FlowControl;

public class FlowControl {
    public static void main(String[] args) {
        //需求一
      double t = 29.8;
      if(t > 37){
          System.out.println("这个人体温异常，报警咯！");
      }
        //需求二
      double money = 11.3;
      if(money > 100){
          System.out.println("发红包成功了");
      }else {
          System.out.println("余额不够");
      }

      //需求三
        int score = -1;
      if(score >= 0 && score < 60){
          System.out.println("您的级别是 0");
      }else if(score > 60 && score < 80){
          System.out.println("您的级别是 1");
      }else if(score > 80 && score < 100){
          System.out.println("您的级别是 2");
      }else {
          System.out.println("您输入的分数有问题！");
      }

      if(score > 7) System.out.println("有我呢提");

//      switch分支
        String name = "你好";
        switch (name){
            case "你好":
                System.out.println("nnn");
                break;
        }
//        long和double和float不支持
        int a = 10;
        double b = 10.2;

        switch (a){
            case 10:
                System.out.println("报错了！");
            case 11:
                System.out.println("你好");
            case 12:
                System.out.println("失败咯");
                break;
        }

//        循环结构 for while do while
        for (int i = 0; i < 5;i++){
            System.out.println("哈哈哈");
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        int b1 = 0;
        //求一到100奇数和
        for (int i = 1; i < 100; i+=2) {
            b1 += i;
        }
        System.out.println(b1);

        int c1 = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 1){
                c1 += i;
            }
        }
        System.out.println(c1);

        //while循环
        int i = 0;
        while (i < 5){
            System.out.println("执行了！");
            i++;
        }

        //while循环案例
        double height = 8848860;
        double height_1 = 0.1;
        int count = 0;

        while (height_1 < height){
            //将纸张厚度变成俩倍
            height_1 *= 2;
            count++;
        }
        System.out.println("折叠次" + count + "次！");

        //do while循环
        int p = 0;
        do{
            System.out.println(p);
            p++;
        }while (p < 10);

        int hh = 0;
        while (hh < 3){
            System.out.println("jhj");
            hh++;
        }
        System.out.println(hh);

        //死循环 写法一
//        for (int j = 0; ;j++) {
//            System.out.println("hello world");
//        }

//        死循环二
//        while (true){
//            System.out.println("hello world");
//        }

//        死循环三
//        do{
//            System.out.println("hello world");
//        }while (true);

        //循环嵌套
        for (int j = 0; j <= 4; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.println("我爱你！！");
            }
        }

        //break终止循环
        for (int j = 0; j <= 5; j++) {
            System.out.println("hjhj1");
            if(j == 2){
                break;
            }
        }

        //continue继续
        for (int j = 1; j < 5; j++) {
            if(j == 3){
                //当j为3不执行此代码
                continue;
            }
            System.out.println("洗碗" + j);
        }
        
    }
}
