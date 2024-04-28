package Arrays;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //指定比较规则
//    this  o
    @Override
    public int compareTo(Student o){
        //约定 如何左边大于右边对象，返回正整数
        //约定 如何左边小于右边对象，返回负整数
        //约定 如何左边等于右边对象，返回0
        // 按照年龄升序排序
//        if(this.age > o.age){
//            return 1;
//        } else if (this.age < o.age) {
//            return -1;
//        }
//        return 0;
        return this.age - o.age;
    }
}
