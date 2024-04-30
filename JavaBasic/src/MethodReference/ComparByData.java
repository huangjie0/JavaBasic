package MethodReference;

public class ComparByData {
    public static int compareByAge(Student o1,Student o2){
       return o1.getAge() - o2.getAge(); //升序排序规则
    }
    public int compareByAgeDesc(Student o1,Student o2){
        return o2.getAge() - o1.getAge();
    }
}
