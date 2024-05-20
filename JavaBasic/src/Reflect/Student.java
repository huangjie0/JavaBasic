package Reflect;

public class Student {
    private String name;
    private int age;
    private String school;

    public Student(String name, int age, String school) {
        System.out.println("有参数构造器调用了");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student() {
        System.out.println("无参数构造器");
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
