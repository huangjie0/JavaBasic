package SubclassConstructor;

public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student("黄杰",19,"北京大学");
        Student s2 = new Student("黄洁",20);

        System.out.println(s2.getSchoolName());
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}

class Student {
    private String name;
    private int age;
    private String schoolName;

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public Student() {
    }

    public Student(String name,int age){
        this(name,age,"华南是dsd");
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
