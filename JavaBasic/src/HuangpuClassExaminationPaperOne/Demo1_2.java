package HuangpuClassExaminationPaperOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1_2 {
    public static void main(String[] args) {
        //准备编号集合
        List<Integer> peoples = new ArrayList<>();
        Random r = new Random();
        //依次存入1-200不重复的编号
        for (int i = 1; i <= 100; i++) {
            int code = r.nextInt(200) + 1;
            //去重
            if(peoples.contains(code)){
                i--;
            }else {
                peoples.add(code);
            }
        }
        System.out.println(peoples);
        //将集合复制一份
        List<Integer> peopleBak = new ArrayList<>();
        peopleBak.addAll(peoples);

        while (peoples.size() > 1){
            for (int i = (peoples.size() %2 == 0 ? peoples.size()-2 : peoples.size() -1); i >= 0; i-=2) {
                peoples.remove(i);
            }
        }
        int code = peoples.get(0);
        System.out.println("编号为" + code);
        int index = peopleBak.indexOf(code);
        System.out.println(index);
    }
}
