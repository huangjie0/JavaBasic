package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    //定义arrayList集合
    private ArrayList<Food> foodsList = new ArrayList<>();
    private Scanner sr = new Scanner(System.in);
    //上架
    public void addFood(){
        Food f = new Food();

        System.out.println("请您输入菜品名称");
        String name = sr.next();
        f.setName(name);

        System.out.println("请您输入菜品价格");
        double price = sr.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入描述");
        String desc = sr.next();
        f.setDesc(desc);

        foodsList.add(f);
        System.out.println("上架成功");
    }

    //展示全部信息
    public void showAllFoods(){
        if(foodsList.size()==0){
            System.out.println("商品为空");
            return;
        }

        for (int i = 0; i < foodsList.size(); i++) {
            Food f = foodsList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("----------------------");
        }
    }
    public void start(){
        while (true) {
            System.out.println("请选择功能");
            System.out.println("1，上架商品");
            System.out.println("2，展示商品");
            System.out.println("3，退出");
            String s = sr.next();
            switch (s){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("下次再来哦！");
                    return;
                default:
                    System.out.println("功能不存在");
            }
        }
    }
}
