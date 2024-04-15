package Inherit3;

public class Test3 {
    public static void main(String[] args) {
        Student s = new Student("黄杰",26);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSchool());
    }
}

class Student{
    private String name;
    private int age;
    private String school;

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name,int age){
        //调用兄弟构造器，并放在第一行
        this(name,age,"东北大学");
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

