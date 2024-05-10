package HuangpuClassExaminationPaperOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1 {
    public static List<Convict> peoples = new ArrayList<>();
    public static void main(String[] args) {
        //完成幸存者案例，每个囚犯是一个对象来实现
        //创建100个囚犯，依次占位，并赋值（1-200的数量，不能重复）

        Random r = new Random();
        for (int i = 1; i <= 100; i++) {
            while (true) {
                int code = r.nextInt(200) + 1;
                //判断是否唯一
                if(isUseCode(code)){
                    Convict people = new Convict(code,i);
                    peoples.add(people);
                    break;
                }
            }
        }
//        System.out.println(peoples);
        //除去奇数位数
        while (peoples.size() > 1){
            List<Convict> temPeople = new ArrayList<>();
            for (int i = 1; i < peoples.size(); i+=2) {
                Convict p = peoples.get(i);
                temPeople.add(p);
            }
            peoples = temPeople;
        }
        Convict luckPeople = peoples.get(0);
        System.out.println(luckPeople);
    }
    public static boolean isUseCode(int code){
        for (Convict people : peoples) {
            if(people.getCode() == code){
                return false;
            }
        }
        return true;
    }
}
