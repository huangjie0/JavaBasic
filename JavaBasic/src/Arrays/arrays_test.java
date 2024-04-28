package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class arrays_test {
    public static void main(String[] args) {
        //返回数组的内容
        int[] arr = {10,20,30,40,50,60};
        String arrs = Arrays.toString(arr);
        System.out.println(arrs);

        //拷贝数组，包前不包后
        int[] arr1 = Arrays.copyOfRange(arr,2,3);
        String arrs1 = Arrays.toString(arr1);
        System.out.println(arrs1);

        //拷贝数组，可以指定长度
        int[] arr2 = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr2));

        //将原数组变成新数组再存进去
        //案例打8折
        double[] prices = {10.2,12,4,134.22 };
        Arrays.setAll(prices, value-> prices[value] * 0.8);
        System.out.println(Arrays.toString(prices));
        //排序,默认从小到大排序
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        //如果数组存储是对象如何排序
        Student [] students = new Student[4];
        students[0] = new Student("马德华",59,180.2);
        students[1] = new Student("刘德华",60,170.2);
        students[2] = new Student("张槎",10,17.2);
        students[3] = new Student("张键",28,22.2);
        //方式一：排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //实现接口匿名内部类
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定比较规则
//                if(o1.getHeight() > o2.getHeight()){
//                    return 1;
//                } else if (o1.getHeight() < o2.getHeight()) {
//                    return -1;
//                }
//                return 0;
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });

        //使用lambda简化函数式匿名内部类做法
        Arrays.sort(students, (o1,o2) -> Double.compare(o1.getHeight(),o2.getHeight()));
    }
}
