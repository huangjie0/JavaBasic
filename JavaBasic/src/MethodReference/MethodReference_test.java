package MethodReference;
/*
*
* jdk8的方法引用，简化
*
* */

import java.util.Arrays;
import java.util.Comparator;

public class MethodReference_test {
    public static void main(String[] args) {
        Student [] students = new Student[4];
        students[0] = new Student("黄杰",12.3,1);
        students[1] = new Student("住友",12.2,12);
        students[2] = new Student("艾蓬",12.5,10);
        students[3] = new Student("王乐",13.2,12);
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //使用lambda表达式简化
//        Arrays.sort(students,(o1, o2) -> o1.getAge() - o2.getAge());
//        Arrays.sort(students,(o1, o2) -> ComparByData.compareByAge(o1,o2));

        //静态方法引用，简写lambda表达式
        Arrays.sort(students,ComparByData::compareByAge);
        System.out.println(Arrays.toString(students));

    }
}
